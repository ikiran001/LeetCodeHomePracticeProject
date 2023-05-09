package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LeetCode1796 {

	public static void main(String[] args) {
		String a="abc1111";
		System.out.println(secondHighest1(a));
	}   

	public static int secondHighest(String s) {
		List<Integer> list=new ArrayList<>();
		for(char ch:s.toCharArray()) {
			int i=0;
			if(!Character.isLetter(ch))list.add(Integer.parseInt(String.valueOf(ch)));
		}

		Collections.sort(list);
		if(list.size()<2)return -1;
		if(list.get(0).equals(list.get(list.size()-1)))return -1;
		int lastIndex=list.size()-1;
		while( lastIndex>=0 && Objects.equals(list.get(lastIndex), list.get(lastIndex-1)) ) 
		{lastIndex=lastIndex-1; }
		return list.get(lastIndex-1);
	}


	public static int secondHighest1(String s) {
	
		Set<Integer> set=new HashSet<>();
		for(char ch:s.toCharArray()) 
			if(!Character.isLetter(ch))set.add(Integer.parseInt(String.valueOf(ch)));
		if(set.size()<2)return -1;
		int j=0;
	    int[] arr=new int[set.size()];
		for(int i: set)arr[j++]=i;
		Arrays.sort(arr);
		return arr[arr.length-2];

	}

}
