package com.Practice;

import java.util.HashMap;

public class Count_letter {

	public static HashMap<Character, Integer> Count(String n) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);

			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}

		}

		return hm;

	}

	public static void main(String[] args) {

		String name = "gganesh";
		// Count(name);
		System.out.println(Count(name));
	}

}
