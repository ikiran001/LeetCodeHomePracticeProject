package HashMapsLeetCode;

import java.util.HashMap;

public class LeetCode {

	public static void main(String[] args) {
		int[] arr= {3,3,7,7,10,11,11};
System.out.println(singleNonDuplicate(arr));

	}
	public static int singleNonDuplicate(int[] nums) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0 ; i<nums.length ; i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}
			else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		for(int key : map.keySet()) {
			if(map.get(key)>0&&map.get(key)<2) {
				return key;
			}

		}
		return -1;
	}
}
