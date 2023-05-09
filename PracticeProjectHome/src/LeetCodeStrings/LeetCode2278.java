package LeetCodeStrings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2278 {

	public static void main(String[] args) {
		String s="jjjj";
		char c='k';
		System.out.println(percentageLetter(s, c));
	}

	public static int percentageLetter(String s, char letter) {
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0; i<s.length();i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		if (!s.contains(String.valueOf(letter))) return 0;
		int b=map.get(letter)*100;
		int len=s.length();
	double a=b/len;;
		return (int) ((a));
	}
}
