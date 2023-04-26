package LeetCodeHArddddddd;

public class LeetCode1526 {

	public static void main(String[] args) {
	int[] arr= {3,1,1,2};
	System.out.println(minNumberOperations(arr));

	}
    public static int minNumberOperations(int[] target) {
    	int ans=0;
    	int previous=0;
    	for(int current : target) {
           ans+=Math.max(current-previous, 0);
           previous=current;
    	}
    	return ans;
    }

}
