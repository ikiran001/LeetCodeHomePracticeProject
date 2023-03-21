package LeetCodeStrings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode409 {

	public static void main(String[] args) {
		String s="abccccdd";
		System.out.println(longestPalindrome(s));
	}

	public static int longestPalindrome(String s) {
		int count=0;
			Map<Character, Integer> map=new HashMap<>();
			for(char ch:s.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.get(ch)%2==1) {
					count++;
				}
				else {
					count--;
				}	
			}
			if(count>1) {
				return s.length()-count+1;
				
			}
			else {
				return s.length();
			}
			
	}

}
