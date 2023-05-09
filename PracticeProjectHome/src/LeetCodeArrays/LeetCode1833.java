package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode1833 {

	public static void main(String[] args) {
int[] arr={1,3,2,4,1};
System.out.println(maxIceCream(arr, 7));
	}
	
public static int maxIceCream(int[] costs, int coins) {
	Arrays.sort(costs);
	int c=0;
	for(int candy:costs) {
		coins-=candy;
		if(coins<0)return c;
		else c++;
	}
        return c;
    }

}
