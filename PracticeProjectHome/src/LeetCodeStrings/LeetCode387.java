package LeetCodeStrings;

public class LeetCode387 {
<<<<<<< HEAD:PracticeProjectHome/src/LeetCodeStrings/LeetCode387.java
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
=======

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

>>>>>>> e5c1a54a61200bee462c15ef9e6bbbf5d0f2a1bc:PracticeProject/src/LeetCodeStrings/LeetCode387.java
}
