package LeetCodeRecursion;

public class LeetCode342 {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(256));

	}


	static boolean isPowerOfFour(int n) {
		return isPower(0,n);
	}

	public static boolean isPower(int i, int n) {
		while(n!=Math.pow(4, i)) {
			if(Math.pow(4, i)>n) {
				return false;
			}
			return isPower(i+1, n);
		}
		return true;

	}

}
