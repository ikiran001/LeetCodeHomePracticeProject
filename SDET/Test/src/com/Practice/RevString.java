package com.Practice;

public class RevString {

	public static String rev(String n) {
		String temp = "";
		for (int i = 0; i < n.length(); i++) {

			char ch = n.charAt(i);
			temp = ch + temp;

		}

		return temp;
	}

	public static void main(String[] args) {

		String name = "ganesh";

		//rev(name);
		System.out.println(rev(name));
        
		
		
	}

}
