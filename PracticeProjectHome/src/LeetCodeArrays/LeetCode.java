package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

	public static void main(String[] args) {
		System.out.println(lastRemaining(10000000));

	}
	public static int lastRemaining(int n) {

		List<Integer> oglist=new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			oglist.add(i);
		}
		return helper(oglist,0);

	}

	public static int helper(List<Integer> list,int c) {
		if(list.size()==1) {
			return list.get(0);
		}
		List<Integer> oglist=new ArrayList<>();
		List<Integer> rev=new ArrayList<>();
		if(c%2!=0) {
			for (int i = list.size()-2; i >= 0; i-=2) {
				oglist.add(list.get(i));
			}

			for (int i = oglist.size()-1; i >=0; i--) {
				rev.add(oglist.get(i));
			}  
			return helper(rev, c+1);
		}
		else {
			for (int i = 1; i < list.size(); i+=2) {
				oglist.add(list.get(i));

			}
			return helper(oglist, c+1);

		}

	}

}
