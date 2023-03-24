package LeetCodeStrings;

public class LeetCode5 {

	public static void main(String[] args) {
String a="abcdcbabcdcaxyx";
System.out.println(longestPalindrome(a));
	}
	
	 public static String longestPalindrome(String s) {
		 int len=s.length();
		 int count=0;
	        int i=1;
	        int j=i-1;
	        int k=i+1;
	        if(j>=0 && k<len ) {
	        while(s.charAt(j)==s.charAt(k)) {
	        		j--;
	        		k++;
	        		count++;
	        	}
	        if(s.charAt(j)!=s.charAt(k) && count>0) {
	        	return s.substring(j+1, k);
	        }
	        else {
	        		i++;
	        		j=i-1;
	    	         k=i+1;
	        }
	        }
	        return s.substring(j+1, k);
	    }

}
