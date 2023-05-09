package LeetCodeStrings;

import java.util.Objects;

public class LeetCode2108 {

	public static void main(String[] args) {
		String[] arr= {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(arr));
	}

	public static String firstPalindrome(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if(isPalindrome(words[i])) {
				return words[i];
			}
		}
		return "";
	}

	public static boolean isPalindrome(String s) {
		int b=0;
		int e=s.length()-1;
		while(b<e) {
			if(Objects.equals(s.charAt(b), s.charAt(e))) {
				b++;
				e--;
			}
			else {return false;}
		}
		return true;
	}

}
