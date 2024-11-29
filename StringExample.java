package com.practice;

import java.util.Arrays;

public class StringExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="hello";
		String s2="sudheer kumar";
		String s3="welcome";
		
		/*
		 * String s=String.join("-",s1,s2,s3);
		 * System.out.println("display join string :"+s);
		 */
		
		String format=String.format("%s%s", s1,s2);
		System.out.println("Display format string---> "+format.toString());
		
		String full="hello welcome to my world";
		System.out.println("substring -->"+full.substring(6));
		System.out.println("substring using first and last index   ->"+full.substring(5, 15));
		
		String spilt="hello, boss . how are you";
		String[] actual=spilt.split("\\,");
		System.out.println("display split string-->"+Arrays.deepToString(actual));
		System.out.println("starts with -->"+spilt.startsWith("he"));
		System.out.println(spilt.toLowerCase());
		System.out.println(spilt.toUpperCase());
		
		
		System.out.println(spilt.intern());
		System.out.println("intern method : "+s3.intern());
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.append("string buffer"));
		
		StringBuilder builder=new StringBuilder("hi");
		System.out.println(builder.append("builder"));
		
		

	}


}
