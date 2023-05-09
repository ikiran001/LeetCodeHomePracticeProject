package LeetCodeRecursion;import java.util.Arrays;


//344. Reverse String
//https://leetcode.com/problems/reverse-string/
public class LeetCode344 {

	public static void main(String[] args) {
		char[]		s = {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(Arrays.toString(s));

	}


	static void reverseString(char[] s) {
		int n=s.length-1;
		int i=0;
		while(n>=i) {
			char temp=s[n];
			s[n]=s[i];
			s[i]=temp;
			i++;
			n--;
		}
	}

}
