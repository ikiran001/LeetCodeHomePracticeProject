package com.Practice;

public class RevSent {

	public static String rev(String n) {

		String temp[] = n.split("\\s");
		// System.out.println(Arrays.toString(temp));
		String output = "";

		for (int i = 0; i < temp.length; i++) {
			output = temp[i]+ " "+output ;
		}

		return output;
	}

	public static void main(String[] args) {
		String name = "Ganesh Kashid";
		// rev(name);
		System.out.println(rev(name));

	}

}
