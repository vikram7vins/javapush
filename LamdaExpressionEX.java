package com.practice;

public class LamdaExpressionEX {
	
	interface A {
		public void addition(int a);

		default void display() {
			System.out.println("display default method");
		}
	}

	//Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface). Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value
	public class LamdaExmaple {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			A obj = (i) -> System.out.println("display use of lamda expression  " + 2 * i);
			obj.addition(5);
			obj.display();

		}

	}


}
