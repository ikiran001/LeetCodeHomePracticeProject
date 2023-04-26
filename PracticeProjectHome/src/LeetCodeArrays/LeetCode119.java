package LeetCodeArrays;

import java.util.*;

public class LeetCode119 {

	public static void main(String[] args) {
		System.out.println(4);

	}
	public static List<Integer> getRow(int numRows) {
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> prev=new ArrayList<>();
		prev.add(1);
		ans.add(prev);
		
		if(numRows<=0)return prev;
	
		for (int i = 1	; i <= numRows; i++) {
			List<Integer> curr=new ArrayList<>();
			curr.add(1);
			for (int j = 0; j < prev.size()-1; j++) {
				curr.add(prev.get(j)+prev.get(j+1));
			}
			curr.add(1);
			ans.add(curr);
			prev=curr;
		}
		return ans.get(numRows);
	
        
    }

}
