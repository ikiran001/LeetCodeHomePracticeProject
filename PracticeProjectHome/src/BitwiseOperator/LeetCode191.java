package BitwiseOperator;
//https://leetcode.com/problems/number-of-1-bits/
//191. Number of 1 Bits
public class LeetCode191 {

	public static void main(String[] args) {
		int n=00000000000000000000000000001011;
		System.out.println(hammingWeight(n));

	}

	static int hammingWeight(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n>>1;
		}
		return count;
	}




}
