package LeetCodeStrings;

public class LeetCode387 {

	public static void main(String[] args) {
		String a="leetcode";
		System.out.println(firstUniqChar(a));
	}
	public static int firstUniqChar(String s) {
		int[] arr=new int[26];
		for(char ch:s.toCharArray()) {
			arr[ch-'a']++;
		}
		for(char ch:s.toCharArray()) {
			if(arr[ch-'a']==1) {
				return s.indexOf(ch);
			}
		}
		return -1;
	}




}
