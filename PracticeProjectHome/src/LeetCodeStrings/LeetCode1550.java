package LeetCodeStrings;

public class LeetCode1550 {

	public static void main(String[] args) {
	int[] arr= {1,2,1,1};
	System.out.println(threeConsecutiveOdds(arr));

	}
	public static boolean threeConsecutiveOdds(int[] arr) {
		int c=0;
		for(int a: arr) {
			if(a%2!=0)c++;
			if(a%2==0)c=0;
			if(c==3)return true;
		}
		return false;
	}
}
