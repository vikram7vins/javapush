package com.practice;

public class SecondHighest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {10,6,45,88,9,45,67,5,9,96,78,96};
		int temp;
		int lenght=array.length;
		
		for(int i=0;i<lenght;i++) {
			
			for(int j=i+1;j<lenght;j++)
			if(array[i]>array[j]) {
				
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			System.out.println("");
			//System.out.println("order of array values "+array);
		}
		for(int k=0;k<lenght;k++) {
			
			System.out.println(array[k]);
		}
		System.out.println("second hightest value :"+array[lenght-2]);

	}

}


