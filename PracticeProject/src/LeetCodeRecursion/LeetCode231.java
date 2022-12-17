package LeetCodeRecursion;
//https://leetcode.com/problems/power-of-two/
//231. Power of Two
public class LeetCode231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(16));

	}
		static boolean isPowerOfTwo(int n) {
			return isPower(0,n);
	
		}
	
		public static boolean isPower(int i, int n) {
			while(n!=Math.pow(2, i)) {
				if(Math.pow(2, i)>n) {
					return false;
				}
				return isPower(i+1,n);
			}
			return true;
	
		}



}
