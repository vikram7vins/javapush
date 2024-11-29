package com.practice;

public class CapatalizeEachWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="my name is bond";
		
		String[] words=str.split(" ");
		String output="";
		for(String w:words) {
			
			String first=w.substring(0, 1);
			String last=w.substring(1);
			output+=first.toUpperCase()+last.toLowerCase()+" ";
			
			
		}System.out.println(output);
		
		
		String s1="100";
		
		System.out.println(Integer.parseInt(s1));
		
		String date="12/1/2024";
		//Date date=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		

	}

}


