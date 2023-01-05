package RecursionGoogleIntrviewQns;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));

	}
	public static List<String> letterCombinations(String digits) {
		List<String> list=new ArrayList<>();
		if(digits.isEmpty()) {
			return list;
		}
		else return letterCombinationsHelper(digits, "");
	}


	public static  List<String> letterCombinationsHelper(String que ,String anf) {
		if(que.isEmpty()) {
			List<String> list=new ArrayList<>();
			list.add(anf);
			return list;
		}      
		List<String> ans=new ArrayList<>();

		int digits=que.charAt(0)-'0';   // will convert '2'  to 2	


		if(digits==7) {
			for (int i = (digits-2)*3; i < (digits*3)-2; i++) {
				char ch=(char)('a'+i);
				ans.addAll(letterCombinationsHelper(que.substring(1), anf+ch));
				
			}
		}
		if(digits==8) {
			for (int i = (digits-2)*3+1; i < (digits*3)-2; i++) {
				char ch=(char)('a'+i);
				ans.addAll(letterCombinationsHelper(que.substring(1), anf+ch));
			}		
		}

		if(digits==9) {
			for (int i = (digits-2)*3+1; i < (digits*3)-1; i++) {
				char ch=(char)('a'+i);
				ans.addAll(letterCombinationsHelper(que.substring(1), anf+ch));
			}		
		}



		if(digits==1 || digits==2 || digits==3 || digits==4|| digits==5 || digits==6) {	
			for (int i = (digits-2)*3; i < (digits*3)-3; i++) {
			char ch=(char)('a'+i);
			ans.addAll(letterCombinationsHelper(que.substring(1), anf+ch));
		}
		}

		return ans;
	}
}
