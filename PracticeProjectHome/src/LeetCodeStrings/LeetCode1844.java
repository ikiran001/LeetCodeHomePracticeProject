package LeetCodeStrings;

public class LeetCode1844 {

	public static void main(String[] args) {
		String  s = "a1c1e1";
		System.out.println(replaceDigits(s));
	}
	public static String replaceDigits(String s) {
		
		String abc="";
		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			abc+=ch;
		}
		String ans="";
		String words;
		for (int i = 0; i < s.length(); i++) {
			String temp=String.valueOf(s.charAt(i));
			String replace=String.valueOf(abc.charAt(i));
			words=temp.replaceAll("[\\d]", replace);
			ans+=words;	
		}
		return ans;
	}

}
