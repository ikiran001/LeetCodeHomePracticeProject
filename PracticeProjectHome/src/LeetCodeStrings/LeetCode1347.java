package LeetCodeStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1347 {

	public static void main(String[] args) {
		String a="aba";
		String t="bab";
		System.out.println(minSteps(a, t));

	}


	public static int minSteps(String s, String t) {
		int c=0;
		Map<Character, Integer>map=new HashMap<>();
		for(char a: s.toCharArray()) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}

		for (int i = 0; i < t.length(); i++) {
			char b=t.charAt(i);
			if(map.containsKey(b)) {
				if(map.get(b)>0) {
					map.put(b, map.get(b)-1);}
				else {c++;}
			}
			else{c++;}}

		return c;	

	}
}
