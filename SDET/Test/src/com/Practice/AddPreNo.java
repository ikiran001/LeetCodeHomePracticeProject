package com.Practice;

import java.util.Arrays;

public class AddPreNo {

	public static int[] CountAdd(int a[]) {

		int sum = 0;
		// int arr[]=new int [a.length];
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			a[i] = sum;
		}

		return a;

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		// CountAdd(a);
		System.out.println(Arrays.toString(CountAdd(a)));

	}

}
