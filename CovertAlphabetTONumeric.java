package com.practice;

public class CovertAlphabetTONumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="a2b3c4";
		
		for(int i=0;i<actual.length();i++) {
			if(Character.isAlphabetic(actual.charAt(i))) {
				System.out.println(actual.charAt(i));
			}else {
				int a =Character.getNumericValue(actual.charAt(i));
				for(int j=0;j<a;j++) {
					
					System.out.println(actual.charAt(i-1));
				}
				
			}
			
		}

	}

}
