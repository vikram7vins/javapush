package com.practice;

import java.util.Arrays;

public class ReverseStringwithSpacespreserved {
	public static void main(String[] args) {
	String actual="welcome to my world";
	char[] ch=actual.toCharArray();
	char[] expected=new char[ch.length];
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==' ') {
			expected[i]=' ';
		}
	}
		int j=expected.length-1;
		for(int k=0;k<ch.length;k++) {
			if(ch[k]!=' ') {
				if(expected[j]==' ') {
					j--;
			}
			expected[j]=ch[k];
			j--;
		}
		}
	System.out.println(" Reverse of String : "+String.valueOf(expected));

}
}