package LeetCodeStrings;

import java.util.Stack;

public class LeetCode {

	public static void main(String[] args) {
		String a="kiran**jadgav****";
		System.out.println(removeStars(a));
	}
	
	  public static String removeStars(String s) {
	       Stack<Character> st= new Stack<>();

	       for(int i =0;i<s.length(); i++){
	           if(s.charAt(i)=='*')
	           st.pop();
	           else
	           st.push(s.charAt(i));
	       } 

//	        StringBuilder ans = new StringBuilder();
//	        while(!st.isEmpty()){
//	            ans.append(st.pop());
//	        }
//	            
//	        return ans.reverse().toString();
	       
	       String a="";
	       for(char ch:st) {
	    	   a+=ch;
	    	   
	       }
	       return a;
	       }
}
