package com.Practice;

import java.util.Arrays;

public class Palindrome {

	public static int palin(int no) {

		// String temp = Integer.toString(no);
		// char [] s =temp.toCharArray();
		// System.out.println(Arrays.toString(s));
		int rev = 0;
		while (no != 0) {
			int temp = no % 10;
			rev = (rev * 10) + temp;
			no = no / 10;
		}

		return rev;
	}

	public static void main(String[] args) {

		int a = 12231;
		int r= palin(a);
	
		if (a==r) {
			System.out.println("no pal");
		}
		else {
			System.out.println("no not pal");
		}
		
	}

}
