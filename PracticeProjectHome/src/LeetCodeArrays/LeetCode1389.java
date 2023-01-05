package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

/*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]*/


public class LeetCode1389 {

	public static void main(String[] args) {
		int[] nums= {0,1,2,3,4};
		int [] index= {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}
	static int[] createTargetArray(int[] nums, int[] index) {
		int [] result=new int[nums.length] ;
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i],nums[i]);
		}
		for(int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
	}
}
