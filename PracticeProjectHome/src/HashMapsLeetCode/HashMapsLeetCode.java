package HashMapsLeetCode;
import java.util.*;
public class HashMapsLeetCode {

	public static void main(String[] args) {
int [] nums= {2,2,1,1,1,2,2};
System.out.println(majorityElement(nums));
	}
	
	  public static int majorityElement(int[] nums) {
	        HashMap<Integer, Integer> map=new HashMap<>();
	        
	        for (int i = 0; i < nums.length; i++) {
	        	 if(!map.containsKey(nums[i])) {
	 	        	map.put(nums[i], 1);
	 	        }
	        	 else {
	        		 map.put(nums[i], map.get(nums[i])+1);
	        	 }
			}
	      
	    int    n=nums.length/2;
	        for(int key:map.keySet()) {
	        	if(map.get(key)>n) {
	        		return key;
	        	}
	        }
	        
	        
	       return -1;
	        
		  
		  
	    }

}
