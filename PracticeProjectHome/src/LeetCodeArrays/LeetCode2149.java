package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2149 {

	public static void main(String[] args) {
int[] num= {3,1,-2,-5,2,-4};
System.out.println(rearrangeArray(num));

	}
	  public static int[] rearrangeArray(int[] nums) {
		 
		  int[] ans=new int[nums.length];
	        List<Integer> pos= new ArrayList<>();
	        List<Integer> neg= new ArrayList<>();
	        for(int n:nums) {
	        	if(n<0) {
	        		neg.add(n);
	        	}
	        	else {
	        		pos.add(n);
	        	}
	        	
	        }
	        int j=0;
	        int len=pos.size()+neg.size();
	        for (int i = 0; i < len/2; i++) {
				ans[j]=pos.get(i);
				j++;
				ans[j]=neg.get(i);
				j++;
			}
	        return ans;
	    }

}
