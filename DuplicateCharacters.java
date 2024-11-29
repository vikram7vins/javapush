package com.practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hellow welcome to my world";
		char[] letters = string.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : letters) {
			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);

		Set<Character> set = map.keySet();
		for (Character c : set) {
			if (map.get(c) > 1) {

				System.out.println(c + ":  character is Iterating " + map.get(c) + ": times");
			}

		}

	}

}
