package MathsForDSA;

import java.util.ArrayList;


//https://leetcode.com/problems/number-of-common-factors/
//2427. Number of Common Factors
public class LeetCode2427 {

	public static void main(String[] args) {
 
	}
    
    public static int factors(int n) {
    
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 1; i <=Math.sqrt(n); i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
					return i;
				}
				else System.out.print(i+" ");
				list.add(n/i);
			}
		}
		
		for(int i=list.size()-1; i>=0;i--) {
			return list.get(i);
			//System.out.print(list.get(i)+" ");
		}
		return n;
		}

}
