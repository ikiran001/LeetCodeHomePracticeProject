package Permutation;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any String : ");
		String a=sc.next();
		permutationSum(a, "");

	}

	public static void permutationSum(String que, String asf) {
		if(que.length()==0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < que.length(); i++) {
			char ch=que.charAt(i); //a
			String lpque=que.substring(0, i);  //left part of the question
			String rpque=que.substring(i+1);  //right p[art of the question
			String roq=lpque+rpque;  //bc    //rest f the question after removing required character


			permutationSum(roq, asf+ch);
		}

	}

}
