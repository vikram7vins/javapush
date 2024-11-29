package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String actual="Hello welcome to my world";
	char[] letter=actual.toCharArray();
	char[] expected=new char[letter.length];
	
	for(int i=0;i<letter.length;i++) {
		if(letter[i]==' ') {
			
			expected[i]=' '; 
		}
		
	}
	System.out.println(expected);
	int j=expected.length-1;
	
	for(int i=0;i<=letter.length-1;i++) {
		if(letter[i]!=' ') {
			if(expected[j]==' ') {
				j--;
			}
				expected[j]=letter[i];
				j--;
		}
		
	}
	System.out.println("Actual String : "+String.valueOf(expected));
	
	
	}

}
