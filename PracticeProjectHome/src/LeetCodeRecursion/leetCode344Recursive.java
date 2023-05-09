package LeetCodeRecursion;

import java.util.Arrays;

public class leetCode344Recursive {

	public static void main(String[] args) {
		char[] s= {'w','r','t','g'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}

	static void reverseString(char[] s) {

		recursiveFunction(s, s.length-1);

	}

	static void recursiveFunction(char[] s, int index) {
		if(index<s.length/2) {
			return;
		}
		char temp=s[index];
		s[index]=s[s.length-index-1];
		s[s.length-index-1]=temp;
		recursiveFunction(s, index-1);	 
		}

}
