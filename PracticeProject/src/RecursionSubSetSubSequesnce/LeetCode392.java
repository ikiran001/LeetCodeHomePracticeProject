package RecursionSubSetSubSequesnce;

import java.util.ArrayList;

public class LeetCode392 {

	public static void main(String[] args) {
		String	s = "acb"; String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
		return subSeq("", t).contains(s);
	}

	public static ArrayList<String> subSeq(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch=up.charAt(0);
		ArrayList<String> left=subSeq(p+ch, up.substring(1));
		ArrayList<String> right=subSeq(p, up.substring(1));

		left.addAll(right);
		return left;


	}




}
