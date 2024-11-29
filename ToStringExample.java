package com.practice;

public class ToStringExample {

	String name;
	int roll=0;
	String town;
	
	public ToStringExample(String name,int roll,String town){
		this.name=name;
		this.roll=roll;
		this.town=town;
		
		
	}
	public String toString() {
		
		return name+" "+roll+" "+town;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToStringExample s1=new ToStringExample("sudheer",100,"nlr");
		ToStringExample s2=new ToStringExample("ram",200,"bdl");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
