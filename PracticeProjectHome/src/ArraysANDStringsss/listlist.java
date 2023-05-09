package ArraysANDStringsss;
import java.util.*;
public class listlist {

	public static void main(String[] args) {
		List<List<String>> list=new ArrayList<>();
		String s="abc";
		System.out.println(practice(s,"",list));

	}
	public static List<List<String>> practice(String que, String ans,List<List<String>> list){
		if(que.isEmpty()) {
			List<String> small=new ArrayList<>();
			small.add(ans);
			list.add(small);
			return list;
		}	
		char ch=que.charAt(0);
		practice(que.substring(1), ans+ch, list);
		practice(que.substring(1), ans, list);

		return list;
	}

}
