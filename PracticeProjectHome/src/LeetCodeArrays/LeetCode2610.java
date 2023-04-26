package LeetCodeArrays;
import java.util.*;

public class LeetCode2610 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,22,33,44,55,66,77,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,22,44,55,66,77,88,99,00};
		System.out.println(findMatrix(arr));

	}
	public  static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer>  curr=new ArrayList<>();
		for(int i=0; i<nums.length;i++) {
			curr.add(nums[i]);
		}
		return helper(curr, ans);
	}

		public static List<List<Integer>> helper(List<Integer> list ,List<List<Integer>> ans) {
			if(list.isEmpty()) {
				return ans;
			}
			List<Integer>  curr=new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {			
				if(!curr.contains(list.get(i))) {
					curr.add(list.get(i));
					list.remove(i--);
				}
			}
			ans.add(curr);
			return helper(list,ans);
		}
}
