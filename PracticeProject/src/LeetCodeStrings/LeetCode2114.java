package LeetCodeStrings;
//2114. Maximum Number of Words Found in Sentences
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class LeetCode2114 {

	public static void main(String[] args) {
String[] a= {"please wait", "continue to fight", "continue to win"};
System.out.println(mostWordsFound(a));

	}
	
	 static int mostWordsFound(String[] sentences) {
			int max=0;
	        int n=sentences.length;
	        for (int i = 0; i < n; i++) {
	        String[] a=	sentences[i].split(" ");
			if(a.length>max) {
				max=a.length;
			}
				
			}
	        return max;
	    }

}
