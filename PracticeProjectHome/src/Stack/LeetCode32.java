package Stack;

import java.util.Stack;

public class LeetCode32 {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()"));

	}

	public static int longestValidParentheses(String s) {
		int ans=0;
		Stack<String> st=new Stack<>();
		for(char ch: s.toCharArray()) {
			if(st.isEmpty() && ch=='(') {
				st.push("(");
				ans++;
			}
			
			else if(!st.isEmpty() && ")".equals(st.peek())&& ch=='(') {
				st.push("(");
				ans++;
			}
			else if(!st.isEmpty() && ch==')' && "(".equals(st.peek())) {
				st.push(")");
				ans++;
			}
		}
		return ans;

	}

}
