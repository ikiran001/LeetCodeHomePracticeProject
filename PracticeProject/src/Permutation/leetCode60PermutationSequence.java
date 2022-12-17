package Permutation;

import java.util.ArrayList;
import java.util.List;

public class leetCode60PermutationSequence {

	public static void main(String[] args) {
		String ans=getPermutation(3,2);
		System.out.println(ans);

	}

	public static String getPermutation(int n, int k) {
		String a="";
		for (int i = 1; i <= n; i++) {
			a+=i;
		}
		return permutation(a, "" ).get(k);
	}

	
	
	public static List<String> permutation(String que, String asn  ){
		if(que.length()==0) {
			List<String> list=new ArrayList<>();
			list.add(asn);
			return list;
		}
		
		List<String> ans=new ArrayList<>();
		for (int i = 0; i < que.length(); i++) {
			char ch=que.charAt(i); //a
			String lpque=que.substring(0, i);  //left part of the question
			String rpque=que.substring(i+1);  //right p[art of the question
			String roq=lpque+rpque;  //bc    //rest f the question after removing required character
		
			ans.addAll(permutation(roq, asn+ch));
		}
		return ans;
	}
}
