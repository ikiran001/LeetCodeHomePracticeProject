package Stack;

import java.util.Stack;

public class LeetCode {

	public static void main(String[] args) {

int[] arr= {1,2,3,4,5};
System.out.println(nextGreaterElements(arr));
	}
	public static int[] nextGreaterElements(int[] nums) {
		Stack<Integer> st=new Stack<>();
		int[] ans= new int[nums.length];
		ans[ans.length-1]=-1;
		st.push(nums[nums.length-1]);
		for(int i=nums.length-2; i>=0; i--){
			while(st.size()>0 && nums[i]>=st.peek()){
				st.pop();
			}
			if(st.size()==0){
				ans[i]=-1;
			}
			else{
				ans[i]=st.peek();
			}
			st.push(nums[i]);
		}

		int target=nums[nums.length-1];
		int i=0;
		while(i<nums.length){
			if(nums[i]>target){
				ans[nums.length-1]=nums[i];
				break;
			}
			else{
				i++;
			}
		}
		return ans;
	}

}
