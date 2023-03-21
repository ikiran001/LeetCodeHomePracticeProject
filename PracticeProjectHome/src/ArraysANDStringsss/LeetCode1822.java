package ArraysANDStringsss;

import java.util.HashMap;

//1822. Sign of the Product of an Array
//	Easy
//	929
//	127
//	Companies
//	There is a function signFunc(x) that returns:
//
//	1 if x is positive.
//	-1 if x is negative.
//	0 if x is equal to 0.
//	You are given an integer array nums. Let product be the product of all values in the array nums.
//
//	Return signFunc(product).

public class LeetCode1822 {

	public static void main(String[] args) {
		int[] arr= {-1,1,-1,1,-1};

		System.out.println(arraySign(arr));

	}

	public static int arraySign(int[] nums) {

		int count=0;
		for(int y: nums) {
			if(y>0) {	
			}
			else {
				count++;
			}
		}
		if(count==0) {
			return 1;
		}


		HashMap<String, Integer> map=new HashMap<>();
		for(int x : nums) {

			if(x==0) {
				return 0;
			}
			if(x<0 && map.isEmpty()) {
				map.put("neg", 1); 
			}
			else	if(x<0) {
				map.put("neg", map.get("neg")+1);
			}
		}
		if(map.get("neg")%2==0) {
			return 1;
		}
		else {
			return -1;
		}

	}

}
