package LeetCodeArrays;
//https://leetcode.com/problems/smallest-even-multiple/submissions/865322880/
//2413. Smallest Even Multiple
public class LeetCode2413 {

	public static void main(String[] args) {
		int n=60;
		System.out.println(smallestEvenMultiple(n));

	}
	public static int smallestEvenMultiple(int n) {
		int ans=n%2;
		if(n%2==0){
			if(n/2==ans){
				return n;
			} 
			else {return n;}
		}
		return n*2;

	} 

}
