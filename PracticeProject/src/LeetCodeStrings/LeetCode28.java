package LeetCodeStrings;

public class LeetCode28 {

	public static void main(String[] args) {
		String haystack="mississippi";
		String needle="issip";
		System.out.println(strStr2(haystack, needle));

	}
	public static int strStr(String haystack, String needle) {


		if(haystack.contains(needle)) {
			return haystack.indexOf(needle.charAt(0));
		}
		else return -1;
	}


	public static String strStr2(String haystack, String needle) {
		if(haystack.isEmpty()) {
			return "";
		}
		char ch=haystack.charAt(0);
		if(haystack.startsWith(needle)) {
			return strStr2(haystack.substring(needle.length()), needle);
		}
		else {
			return ch+ strStr2(haystack.substring(1), needle);
		}

	}

}
