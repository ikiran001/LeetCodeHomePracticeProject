package Stack;

import java.util.Stack;

//20. Valid Parentheses
public class LeetCode20 {

	public static void main(String[] args) {
		String a="}";
		System.out.println(isValid(a));
	}



	public static boolean isValid(String s) {
		Stack<Character> st= new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}

			else if(ch==')') {
				boolean a=checkCon(st, '(');
				if(!a) {
					return false;
				}
			}
			else if(ch=='}') {
				boolean a=	checkCon(st, '{');
				if(!a) {
					return false;
				}
			}
			else if(ch==']') {
				boolean a=	checkCon(st, '[');
				if(!a) {
					return false;
				}
			}
		}

		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}

	}

	public static boolean checkCon(Stack<Character> st, char value) {
		if(st.isEmpty()) {
			return false;
		}
		if(st.peek()!=value) {
			return false;
		}
		else {
			st.pop();
			return true;
		}

	}
}


