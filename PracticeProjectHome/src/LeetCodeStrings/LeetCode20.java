package LeetCodeStrings;
//20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/
public class LeetCode20 {

	public static void main(String[] args) {
String s = "[{[]}]";
System.out.println(isValid(s));
	}
	static boolean isValid(String s) {
		
		int count=0;
		int length=s.length();
		
		
		for (int i = 0; i < length; i++) {
			if(i<length-1 && s.charAt(i)=='(' &&s.charAt(i+1)==')') {
				count++;
				i+=1;
			}
			else if(i<length-1 && s.charAt(i)=='[' &&s.charAt(i+1)==']') {
				count++;
				i+=1;
			}
			else if(i<length-1 && s.charAt(i)=='{' &&s.charAt(i+1)=='}') {
				count++;
				i+=1;
			}
			else return false;
		}
		if(count==length/2) {
			return true;
		}
		return false;
	}

}
