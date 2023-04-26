package LeetCodeStrings;

public class LeetCode121 {

	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

	public static  int maxProfit(int[] prices) {
		int lowPrice=Integer.MAX_VALUE;
		int profit=0;
		int diff=0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<lowPrice) {
				lowPrice=prices[i];
			}
			diff=prices[i]-lowPrice;
			if(diff>profit) {
				profit=diff;
			}
		}
		return profit;
	}

}
