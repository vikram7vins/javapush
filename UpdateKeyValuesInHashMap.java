package com.practice;

import java.util.HashMap;
import java.util.Set;

public class UpdateKeyValuesInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("mobile1" ,":+918015801597");
		map.put("mobile2" ,":+919019050898");
		
		/*Set<String> set=map.keySet();
		for(String str:set) {*/
			
		System.out.println("Initial value of :"+map);
			String value1=map.get("mobile1");
			String value2=map.get("mobile2");
			
			value1=value1.replace("+91", "0");
			value2=value2.replace("+91", "0");
			
			map.put("mobile1" ,value1);
			map.put("mobile2" ,value2);
			
			System.out.println(map);
			
		}


	}


