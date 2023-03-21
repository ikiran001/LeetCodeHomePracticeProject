package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode1051 {
	public static void main(String[] args) {

	}

	public int heightChecker(int[] heights) {
		int count=0;
		int [] copiedArr=Arrays.copyOf(heights, heights.length);
		Arrays.sort(heights);
		for (int i = 0; i < copiedArr.length; i++) {
			if(heights[i]!=copiedArr[i]) {
				count++;
			}
		}
		return count;
	}
}
