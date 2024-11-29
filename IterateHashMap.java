package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Sudheer");
		map.put(5, "Hem");
		map.put(3, "Hari");
		map.put(2, "dhana");
		map.put(4, "devara");
		
		
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()) {
			int key=it.next();
			String value=map.get(key);
			
			System.out.println("HashmapKey : "+key   +" ->Value : " +value);
			
			
			
		}
		
		
		ArrayList<Integer> list1=new ArrayList<>(map.keySet());
		for(Integer in:list1) {
			
			System.out.println(" Keys values : "+in);
		}
		
		ArrayList<String> list2=new ArrayList<String>(map.values());
		for(String str:list2)
			System.out.println("Values are :" +str );
	}

}
