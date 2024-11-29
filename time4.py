import pandas as pd
import torch
from transformers import BertTokenizer, BertForSequenceClassification, Trainer, TrainingArguments
from transformers import DataCollatorWithPadding
from datasets import Dataset
import numpy as np
import os
import time
from datetime import timedelta
import json  # For saving and loading label_mapping
#pip install transformers datasets pandas openpyxl tqdm 
# Load a pre-trained BERT tokenizer for sequence classification
tokenizer = BertTokenizer.from_pretrained('bert-base-uncased')

# Preprocess function to tokenize text and handle padding/truncation
def preprocess_function(examples):
    return tokenizer(examples['text'], truncation=True, padding='max_length', max_length=128)

# Load training data and map labels to integers
def load_train_data(train_file):
    df = pd.read_excel(train_file)  # Load training data from Excel file
    texts = df['ErrorDescription'].tolist()  # Assuming the column for text is 'ErrorDescription'
    labels = df['ErrorCategory'].tolist()  # Assuming the column for labels is 'ErrorCategory'

    # Map string labels to integers
    label_mapping = {label: idx for idx, label in enumerate(set(labels))}
    print(f"Label Mapping: {label_mapping}")  # To see the mapping of labels

    # Map the labels using the dictionary
    labels = [label_mapping[label] for label in labels]

    dataset = Dataset.from_pandas(pd.DataFrame({'text': texts, 'label': labels}))
    return dataset, label_mapping

# Load test data
def load_test_data(test_file):
    df = pd.read_excel(test_file)  # Load test data from Excel file
    texts = df['ErrorDescription'].tolist()

    dataset = Dataset.from_pandas(pd.DataFrame({'text': texts}))
    return df, dataset

# Method to train the model with validation and time logging
def train_model(train_file, output_model_dir):
    if not os.path.exists(output_model_dir):
        os.makedirs(output_model_dir)

    # Load and preprocess training data
    dataset, label_mapping = load_train_data(train_file)
    tokenized_dataset = dataset.map(preprocess_function, batched=True)

    # Split into train and validation sets
    train_dataset, val_dataset = tokenized_dataset.train_test_split(test_size=0.2).values()

    # Data collator for dynamically padding the sequences
    data_collator = DataCollatorWithPadding(tokenizer)

    # Set up training arguments for optimization
    training_args = TrainingArguments(
        output_dir=output_model_dir,
        evaluation_strategy="epoch",
        per_device_train_batch_size=16,
        per_device_eval_batch_size=16,
        num_train_epochs=3,
        save_strategy="epoch",
        logging_dir='./logs',
        logging_steps=10,
        load_best_model_at_end=True,
        save_total_limit=1,
        fp16=True  # Mixed precision training for speed
    )

    # Initialize the BERT model
    model = BertForSequenceClassification.from_pretrained('bert-base-uncased', num_labels=len(label_mapping))

    # Initialize the Trainer
    trainer = Trainer(
        model=model,
        args=training_args,
        train_dataset=train_dataset,
        eval_dataset=val_dataset,
        tokenizer=tokenizer,
        data_collator=data_collator,
    )

    # Start time tracking
    start_time = time.time()

    # Train the model
    trainer.train()

    # End time tracking and display time taken
    end_time = time.time()
    training_time = end_time - start_time
    print(f"Training completed in: {timedelta(seconds=training_time)}")

    # Save the trained model
    trainer.save_model(output_model_dir)
    print(f"Model saved to {output_model_dir}")

    # Save label mapping inside the model directory
    label_mapping_file = os.path.join(output_model_dir, 'label_mapping.json')
    with open(label_mapping_file, 'w') as f:
        json.dump(label_mapping, f)
    print(f"Label mapping saved to {label_mapping_file}")

# Method to load model, predict on new test data, and handle errors
def test_model(saved_model_dir, test_file, output_file):
    # Load the label mapping from the model directory
    label_mapping_file = os.path.join(saved_model_dir, 'label_mapping.json')
    with open(label_mapping_file, 'r') as f:
        label_mapping = json.load(f)

    # Load the saved model
    model = BertForSequenceClassification.from_pretrained(saved_model_dir)
    trainer = Trainer(model=model, tokenizer=tokenizer)

    # Load and preprocess test data
    df, test_dataset = load_test_data(test_file)
    tokenized_test_dataset = test_dataset.map(preprocess_function, batched=True)

    # Start time tracking for predictions
    start_time = time.time()

    # Predict using the trained model
    predictions = trainer.predict(tokenized_test_dataset)

    # Get the predicted labels (argmax over logits)
    predicted_logits = predictions.predictions
    predicted_labels = np.argmax(predicted_logits, axis=1)

    # Convert numerical labels back to their original category names
    inverse_label_mapping = {v: k for k, v in label_mapping.items()}
    predicted_categories = [inverse_label_mapping[label] for label in predicted_labels]

    # Handle predictions that have very low confidence (less than threshold)
    threshold = 0.5  # This can be tuned
    confidence_scores = np.max(predicted_logits, axis=1)
    predicted_categories = [
        inverse_label_mapping[label] if confidence >= threshold else 'None'
        for label, confidence in zip(predicted_labels, confidence_scores)
    ]

    # Add the predictions as a new column in the test file dataframe
    df['Predicted'] = predicted_categories

    # Save the dataframe to the output file
    df.to_excel(output_file, index=False)
    print(f"Predictions saved to {output_file}")

    # End time tracking for testing
    end_time = time.time()
    testing_time = end_time - start_time
    print(f"Testing completed in: {timedelta(seconds=testing_time)}")

# Usage example (run these manually in a script or notebook):

# 1. To train and save the model:
#train_model(r'C:\Users\Vikram\Downloads\training_data.xlsx', r'C:\Users\Vikram\Downloads\saved_model4')

# 2. To load the model and test on new input data:
test_model(r'C:\Users\Vikram\Downloads\saved_model4', r'C:\Users\Vikram\Downloads\input_data.xlsx', r'C:\Users\Vikram\Downloads\input_data_with_predictions.xlsx')
