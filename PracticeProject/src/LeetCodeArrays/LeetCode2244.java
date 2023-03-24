package LeetCodeArrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2244 {

	public static void main(String[] args) {
 int [] arr= {69,65,62,64,70,68,69,67,60,65,69,62,65,65,61,66,68,61,65,63,60,66,68,66,67,65,63,65,70,69,70,62,68,70,60,68,65,61,64,65,63,62,62,62,67,62,62,61,66,69};
 System.out.println(minimumRounds(arr));
 

	}
	 public static int minimumRounds(int[] tasks) {
		 int c=1;

		 int ans=0;
		 Map<Integer, Integer> map=new HashMap<>();
		 for(int a: tasks) {
			 map.put(a, map.getOrDefault(a, 0)+1);
		 }
		 for(int k: map.keySet()) {
			 int temp=map.get(k);
			 if(temp==1) {
				 return -1;
			 }
			 else if(temp%3==0) {
				 ans+=(temp/3);
			 }
			 else if(temp<5 && temp%2==0) {
				 ans+=temp/2;
			 }
			 else {
				 while(temp%3!=0 && c-1%2!=0 ) {
					 temp--;
					 c++; 
				 }
				 ans+=temp/3;
				 ans+=c-1/2;
				
			 }
			 
		 }
		 return ans;
	        
	    }

}
