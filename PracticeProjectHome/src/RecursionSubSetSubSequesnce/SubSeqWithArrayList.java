package RecursionSubSetSubSequesnce;

import java.util.ArrayList;

public class SubSeqWithArrayList {

	public static void main(String[] args) {
		String a="abc"; 
		System.out.println(subSeq("", a));

	}

	static ArrayList<String> subSeq(String p, String up){
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
