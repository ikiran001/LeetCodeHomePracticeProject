package com.Practice;

public class MinMAx {

	public static int max(int a[]) {
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {

			if (temp > a[i]) {
				temp = a[i];
			}
		}

		return temp;
	}

	public static void main(String[] args) {

		int arr[] = { 15, 5, 6, 9, 7, 6, 3, 4, 11 };
		// max(arr);
		System.out.println(max(arr));

	}

}
