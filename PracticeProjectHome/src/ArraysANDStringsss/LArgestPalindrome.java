package ArraysANDStringsss;

import java.util.Objects;

public class LArgestPalindrome {
	static int resultstart;
	static int resultLength;

	public static void main(String[] args) {
		String a="abcddcbaasdfghjkllkjhgfdsa";
		System.out.println(isLargPali(a));
	}


	public static String isLargPali(String s) {
		if(s.length()<2) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			expandRange(s, i, i);
			expandRange(s, i, i+1);
		}
		return s.substring(resultstart, resultLength+resultstart);
	}

	public static void expandRange(String str, int b, int e) {
		while(b>=0 && e<str.length() && Objects.equals(str.charAt(b), str.charAt(e))) {
			b--;
			e++;
		}
		if(resultLength<e-b-1) {
			resultstart=b+1;
			resultLength=e-b-1;
		}
	} 
}
