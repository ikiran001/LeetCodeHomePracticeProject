package LeetCodeStrings;

import java.util.StringTokenizer;

public class LeetCode125 {

	public static void main(String[] args) {
		String s="Marge, let's \\\"[went].\\\" I await {news} telegram.";
		System.out.println(isPalindrome2(s));
	}

	@SuppressWarnings("unlikely-arg-type")
	public static boolean isPalindrome(String s) {
		if(s.isEmpty()) {
			return true;
		}
		StringTokenizer st=new StringTokenizer(s,"[ ,\\\"./!@#$%{??;}`^&;*'-()_+?><:]");
		String sb="";
		while(st.hasMoreElements()) {
			sb+=""+st.nextToken();
		}
		sb=sb.trim();
		sb=sb.toLowerCase();
		StringBuffer sk=new StringBuffer(sb);
		return sb.equals(""+sk.reverse());
	}
	
	
	
	public static boolean isPalindrome2(String ss) {
		if(ss.isEmpty()) {
			return true;
		}
		int s=0;
		int e=ss.length()-1;
		while(s<=e) {
			char start=ss.charAt(s);
			char end=ss.charAt(e);
		
		if(!Character.isLetterOrDigit(start)) {
			s++;
		}
		else if(!Character.isLetterOrDigit(end)) {
			e--;
		}
		else {
			if(Character.isLetterOrDigit(start)!=Character.isLetterOrDigit(end)) {
				return false;
			}
			s++;
			e--;
		}
		
		}
		return true;
	
	}
	
	
}
