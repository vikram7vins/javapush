package com.practice;

public class ReplaceOfSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="10 hello buddy 2000 def 405";
		String regex="[^0-9]+";
		
		String[] actual=string.split(regex);
		
		String first=actual[0];
		String second=actual[1];
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(actual[2]);
		
		String string1="10 20 hello guys 30";
		String actual1=string1.replaceAll("^\\d+", " ");
		
		System.out.println("Display :"+actual1);
		
		
		//method 3
		String string3="Hello world 123 welcome 2 my world 345";
		
		string3=string3.replaceAll("[^0-9]", " ");
		string3=string3.replaceAll(" +"," ");
		
		System.out.println("Display String 3 : "+string3);
		System.out.println("method 3"+string3);
		String[] value=string3.split(" ");
		
		for(int i=0;i<value.length;i++ ) {
			
			System.out.println(value[i]);
			
		}	
		String s1="s2jud639%^&n29@N#jd"	;
		String s2=s1.replaceAll("[^0-9]", " ");
		System.out.println("remove numerics of s2 :"+s2);
		System.out.println("remove spaces "+s2.replaceAll(" +"," "));
		
		
		}

}
