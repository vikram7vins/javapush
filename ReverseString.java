package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="welcome to my world";
		char[] letters=actual.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=letters.length-1;i>=0;i--) {
			
			sb.append(letters[i]);
		}
		
		System.out.println(sb);
	String result=" ";
	
	String a="welcome to my world";
	String[] expected=a.split(" ");
	for(String s:expected) {
		StringBuilder sbuilder=new StringBuilder(s);
		
		
		result+=sbuilder.reverse()+" ";
	}
System.out.println(result);
}

}
