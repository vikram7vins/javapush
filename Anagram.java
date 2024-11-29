package com.practice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="thing", s2="light";
		
		boolean status=true;
		if(s1.length()!=s2.length()) {
			
			status= false;
		}else {
			
			char[] as1=s1.toLowerCase().toCharArray();
			char[] as2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(as1);
			Arrays.sort(as2);
			System.out.println(as1);
			System.out.println(as2);
			status=Arrays.equals(as1,as2);
			
			
			if(status) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not equal");
			}
		}

	}


}
