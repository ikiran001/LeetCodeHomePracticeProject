package Stack;

import java.util.Stack;
import java.util.Vector;

public class LeetCode496 {

	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        Stack<Integer> stack=new Stack<>();
	        Vector<Integer> vec=new Vector<>(nums1.length);
	        
	        for (int i = nums2.length-1; i >=0; i--) {
				if(stack.size()==0) {
					vec.add(-1);
				}
				if(stack.size()>0 && stack.peek()>nums1[i]) {
					
				}
			}
			return nums2;
	    }
}
