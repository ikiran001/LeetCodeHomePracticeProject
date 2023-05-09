package Backtracking;

public class LeetCode62 {

	public static void main(String[] args) {


	}
	public int uniquePaths(int m, int n) {
	
		if(m==1 && n==1) {
			return 1;
		}	 

		int lhs=0;
		if(m>0) {
			lhs=uniquePaths(m-1, n);
		}int rhs=0;
		if(n>0) {
			rhs=uniquePaths(m, n-1);
		}
		return lhs+rhs;
	}



}
