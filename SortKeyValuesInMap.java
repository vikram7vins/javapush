package com.practice;

import java.util.HashMap;
import java.util.Map;

public class SortKeyValuesInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(40, "sudheer");
		map.put(10, "Krish");
		map.put(50, "Hari");
		map.put(05, "Dhana");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
	}

}
