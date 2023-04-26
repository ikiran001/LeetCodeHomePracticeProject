package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {

	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans=new ArrayList<>();
		if(numRows<=0)return ans;
		List<Integer> prev=new ArrayList<>();
		prev.add(1);
		ans.add(prev);
		for (int i = 1	; i < numRows; i++) {
			List<Integer> curr=new ArrayList<>();
			curr.add(1);
			for (int j = 0; j < prev.size()-1; j++) {
				curr.add(prev.get(j)+prev.get(j+1));
			}
			curr.add(1);
			ans.add(curr);
			prev=curr;
		}
		return ans;
	}
}
