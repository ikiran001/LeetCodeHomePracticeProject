package LeetCodeStrings;

import java.util.Stack;

public class LeetCode1047 {
	public static void main(String[] args) {
		String s="azxxzy";
		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {
		String ans="";
		Stack<Character> st=new Stack<>();
		for(char c:s.toCharArray()) {	
			if(!st.isEmpty() && st.peek()==c) {
				st.pop();
			}
			else {
				st.push(c);
			}
		}
		
		for(char c:st) {
			ans+=c;
		}
		return ans;
	}
}

