package com.Practice;

public class removeduplicatesInt {

	public static int rem(int arr[], int l) {
		int j = 0;

		for (int i = 0; i < l; i++) {

			for (j = 0; j < l - 1; j++) {

				if (arr[i] != arr[j]) {
					arr[j] = arr[i];
				}
				
			}arr[j] = arr[l - 1];
		}

		return j;
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 9, 8, 8, 7, 2, 5, 6 };
		int le = a.length;
		int j = 0;
		j = rem(a, le);

		for (int i = 0; i < j; i++)
			System.out.print(a[i] + " ");
	}

}
