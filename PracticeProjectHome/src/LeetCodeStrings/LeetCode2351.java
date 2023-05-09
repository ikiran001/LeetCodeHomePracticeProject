package LeetCodeStrings;

public class LeetCode2351 {

	public static void main(String[] args) {
 String s="kirann";
 System.out.println(repeatedCharacter(s));
 
	} 
	public static char repeatedCharacter(String s) {
		char[] arr1=s.toCharArray();
		int [] arr=new int[26];
		for(char ch:arr1) {
			arr[ch-'a']++;
			if(arr[ch-'a']==2) return ch;
	}
		return arr1[0];
	}
}
	
