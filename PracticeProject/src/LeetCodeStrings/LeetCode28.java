package LeetCodeStrings;

public class LeetCode28 {

	public static void main(String[] args) {
		String haystack="mississippi";
		String needle="issip";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		String  a=haystack;
		if(haystack.substring(0, needle.length()).contains(needle)) {
			return haystack.indexOf(needle.charAt(0));
		}
		return strStr(a.substring(1), needle);
	}
}
