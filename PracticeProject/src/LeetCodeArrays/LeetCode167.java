package LeetCodeArrays;

import java.util.Arrays;
import java.util.Iterator;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
/*Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
public class LeetCode167 {

	public static void main(String[] args) {

int[] nums= {-1,0};

System.out.println(Arrays.toString(twoSum(nums, -1)));
	}

	static int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==target) {
					return new int[]{i+1,j+1};
					
				}
			}
		}
return numbers;
	}

}
