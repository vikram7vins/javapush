package com.practice;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,4,1,3,2,7,2,9,0,6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//int i=1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]-arr[i-1]==1) {
			
			}else {
				System.out.println("Missing values  :  "+(arr[i-1]+1));
			}
			
		}

	}

}
