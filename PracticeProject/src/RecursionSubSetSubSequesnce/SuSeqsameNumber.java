package RecursionSubSetSubSequesnce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuSeqsameNumber {

	public static void main(String[] args) {
		
		
		int [] arr= {1,2,2};
		List<List<Integer>> ans=subSet(arr);
		
		for(List<Integer> list: ans) {
			int [] abc=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			abc[i]=list.get(i);
		}
			System.out.println(list);
		}

	}

	public static List<List<Integer>> subSet(int [] nums){
		Arrays.sort(nums);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int start= 0;
		int end =0;
		for (int i = 0; i < nums.length; i++) {
			start=0;
			if(i>0 && nums[i]==nums[i-1]) {
				start=end+1;
			}
			end=outer.size()-1;
			int n =outer.size();
			for (int j = start; j < n; j++) {
				List<Integer> inner=new ArrayList<>(outer.get(j));
				inner.add(nums[i]);
				outer.add(inner);

			}
		}
		return outer;
	}
}
