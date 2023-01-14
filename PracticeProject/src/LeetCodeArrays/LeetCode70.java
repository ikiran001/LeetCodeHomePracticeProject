package LeetCodeArrays;

public class LeetCode70 {

	public static void main(String[] args) {
		System.out.println(climbStairs(10));

	}

	public static int climbStairs(int n) {

        int dp[]=new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++) {
            dp[i]=dp[i-1] + dp[i-2];
        }
        return dp[n];

	}
	
//	int[] arr=new int[n+1];
//	arr[0]=1;
//	arr[1]=1;
//	for(int i=2;i<=n;i++){
//	arr[2]=arr[i-2]+arr[i-1];
//	}
//	return arr[n];

	public static int helper(int count , int n) {
		int right=0;
		if(n==0 ) {
			count++;
			return count;
		}

		int left= helper(count, n-1);
		if(n>=2) { right=helper(count, n-2);}
		return left+right;
	}

}
