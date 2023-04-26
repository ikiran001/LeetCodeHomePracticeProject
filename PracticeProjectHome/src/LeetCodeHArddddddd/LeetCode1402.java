package LeetCodeHArddddddd;

import java.util.Arrays;
import java.util.Iterator;

public class LeetCode1402 {

	public static void main(String[] args) {
		int[] arr= {0,-1,-8,-9,5};
System.out.println(maxSatisfaction(arr));
	}
	
	 public  static int maxSatisfaction(int[] satisfaction) {
		 int max=0;
		 Arrays.sort(satisfaction);
		 for (int i = 0; i < satisfaction.length/2+1; i++) {
			int sum=0;
			int k=1;
			for (int j = i; j < satisfaction.length; j++) {
				sum+=satisfaction[j]*k++;
			}
			if(sum>max) max=sum;
		}
		 return max;
	 }

}
