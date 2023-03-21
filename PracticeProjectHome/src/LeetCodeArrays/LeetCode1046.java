package LeetCodeArrays;

import java.util.*;


//https://leetcode.com/problems/last-stone-weight/
//1046. Last Stone Weight
// stones = [2,7,4,1,8,1]
//We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone

public class LeetCode1046 {

	public static void main(String[] args) {
		int [] arr= {3,7,8};
		System.out.println(lastStoneWeight(arr));	;


	} 

	public static int lastStoneWeight(int[] stones) {
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < stones.length; i++) {
			list.add(stones[i]);
		}
		return helper(list) ;
	}

	public static int helper(List<Integer> list) {

		if(list.size()==1) {
			return list.get(0);
		}

		int m1=	maxIndex(list);  //index=4
		int elementM1=list.get(m1);//element=8
		list.remove(m1); // [2,7,4,1,null,1]


		int m2=maxIndex(list);
		int elementM2=list.get(m2);
		list.remove(m2);

		int diff=elementM1-elementM2;
		if(list.isEmpty() && diff==0) {
			return 0;
		}
		else if(diff==0);
		else {list.add(diff);}
		return helper(list);
	}

	public static int maxIndex(List<Integer> list) {
		int max=list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}	
		}
		return list.indexOf(max);

	}

}
