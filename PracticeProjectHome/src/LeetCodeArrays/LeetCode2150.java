package LeetCodeArrays;
import java.util.*;

public class LeetCode2150 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,3};
		System.out.println(findLonely(arr));
	}

	public static List<Integer> findLonely(int[] nums) {
		List<Integer> ans=new ArrayList<>();
		Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for (int num: nums) {
			if(map.get(num)<2 && !map.containsKey(num-1) && !map.containsKey(num+1)) {
				ans.add(num);
			}	
		}
		return ans;
	}
}
