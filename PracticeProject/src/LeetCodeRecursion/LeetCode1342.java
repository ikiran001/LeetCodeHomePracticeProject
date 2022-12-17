package LeetCodeRecursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//1342. Number of Steps to Reduce a Number to Zero
public class LeetCode1342 {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));

	}
	static int numberOfSteps(int num) {
		return count(0, num);
	}

	public static int count(int cnt, int n) {
		if(n==0) {
			return cnt;
		}
		if(n%2==0) {
			cnt++;
			n=n/2;
			return count(cnt, n);
		}
		else {
			n=n-1;
			cnt++;
			return count(cnt, n);
		}
	}
}
