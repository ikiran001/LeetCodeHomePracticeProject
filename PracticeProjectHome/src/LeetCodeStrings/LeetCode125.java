package LeetCodeStrings;

import java.util.Objects;

import ArraysANDStringsss.IsPalindrome;

public class LeetCode125 {

	public static void main(String[] args) {
		String s="A man, a plan, \"a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		if(s.isEmpty()) {
			return true;
			
		}
		String s1=s.replaceAll("[ ,./!@#$%^&*()_+?><:]", "");
		return isPal(s1.toLowerCase());
	}	

	public static boolean isPal(String s) {
		int b=0;
		int e=s.length()-1;
		while(b<e) {
			if(Objects.equals(s.charAt(b), s.charAt(e))) {
				b++;
				e--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
