package LeetCodeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode1002 {

	public static void main(String[] args) {
		String[] words= {"bella","label","roller"};
		System.out.println(commonChars(words));
	}

	public static List<String> commonChars(String[] words) {
		Set<Character> set=null;
		Map<Character, Integer> map=new HashMap<>();
		List<String> list=new ArrayList<>();
		int j=0;
		for(int i=0; i<words.length;i++) {
			set=new HashSet<>();
			for(char ch: words[j].toCharArray()) {
				set.add(ch);
			}
			for(char ch:set) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		for(char ch: map.keySet()) {
			if(map.get(ch)==words.length) {
				list.add(String.valueOf(ch));
			}
		}
		return list;
	}
}
