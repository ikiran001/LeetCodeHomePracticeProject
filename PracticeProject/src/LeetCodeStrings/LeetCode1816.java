package LeetCodeStrings;
//https://leetcode.com/problems/truncate-sentence/
//1816. Truncate Sentence
public class LeetCode1816 {

	public static void main(String[] args) {
	String s = "Hello how are you Contestant";
	int k = 4;
System.out.println(truncateSentence(s, k));
	}
	 static String truncateSentence(String s, int k) {
	     String [] a=s.split(" ");
	     String b="";
	     for (int i = 0; i < k; i++) {
			b+=a[i]+" ";
		}
	     return b.trim();
	    }

}
