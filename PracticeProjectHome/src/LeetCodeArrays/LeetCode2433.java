package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode2433 {

	public static void main(String[] args) {
		int[] arr= {5,2,0,3,1};
		System.out.println(Arrays.toString(findArray(arr)));
		

	}

	public static int[] findArray(int[] pref) {
		int n=pref.length;
        int[] arr=new int [n];
        arr[0]=pref[0];
        
        for(int i=(n-1);i>0;i--){
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
	}
}
