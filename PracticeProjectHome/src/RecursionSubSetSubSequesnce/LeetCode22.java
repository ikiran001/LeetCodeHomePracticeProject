package RecursionSubSetSubSequesnce;

import java.util.*;

public class LeetCode22 {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(4));

	} 
	public static  List<String> generateParenthesis(int n) {
		List<String> ans=new ArrayList<>();
		helper(ans, 0, 0, "", n);
		return ans;


	}
	public static void helper(List<String> ans, int left , int right , String s, int n) {
		if(s.length()==n*2) {
			ans.add(s);
			return;
		}

		if(left<n) {
			helper(ans, left+1, right, s+"(", n);
		}

		if(right<left) {
			helper(ans, left, right+1, s+")", n);
		}

	}

}
