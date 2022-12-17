package LeetCodeArrays;

import java.util.Iterator;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295. Find Numbers with Even Number of Digits
public class LeetCode1295 {

	public static void main(String[] args) {
		int[]	nums = {12,345,2,6,7896};

		System.out.println(num(nums));
	}
	static int num(int [] nums){
		int count=0;
		for (int num : nums) {
			if(evenNumber(num)) {
			count++;}
		}
		return count;
	}

	static boolean evenNumber(int n) {
		int evenNum=digits(n);
		if (evenNum%2==0) {
			return true;

		}
		else return false;
	}

	static int digits(int n) {
		int count=0;
		while(n>0) 
		{
			count++;
			n=n/10;
		}
		return count;
	}
}
