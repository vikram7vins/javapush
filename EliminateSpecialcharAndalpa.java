package com.practice;

import java.util.Arrays;

public class EliminateSpecialcharAndalpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="	 try23jghjh$%67jhhg*&89";
		
		String expected=actual.replaceAll("[^0-9]", " ");
		expected=expected.replaceAll(" +"," ");
		System.out.println(expected);
		String[] str=expected.split(" ");
		System.out.println("Display string : "+Arrays.toString(str));
		int result=0;
		for(int i=0;i<str.length;i++) {
			result=result+Integer.parseInt(str[i]);
			
		}
		System.out.println("Sum of digits: "+result);

	}

}
