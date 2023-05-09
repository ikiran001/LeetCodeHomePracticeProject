package LeetCodeStrings;

public class LeetCode2186 {

	public static void main(String[] args) {
		String a="leetcode";
		String b="coats";
		System.out.println(minSteps(a, b));

	}
	public static  int minSteps(String s, String t) {
		int[] sFreq=new int[26];
		int[] tFreq=new int[26];
		for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
			if(i<s.length()) sFreq[s.charAt(i)-'a']++;
			if(i<t.length()) tFreq[t.charAt(i)-'a']++;
		}
		int ans=0;
		for(int i=0;i<sFreq.length ;i++) {
			ans+=Math.abs(sFreq[i]-tFreq[i]);
		}
		return ans;
	}
}