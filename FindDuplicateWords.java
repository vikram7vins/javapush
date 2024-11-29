package com.practice;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentense="welcome to my world and to my home";
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] actual=sentense.split(" ");
		
		for(String str:actual) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
		Set<String> set=map.keySet();
		for(String s:set) {
			if(map.get(s)>1) {
				System.out.println("Key : "+s +" --> And repeated Values +" +map.get(s) );
				
			}
		}
		
	}

}
