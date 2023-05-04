package LeetCodeStrings;

public class LeetCode1832 {

	public static void main(String[] args) {
		String a="aa";
		System.out.println(checkIfPangram(a));
	}

	public static boolean checkIfPangram(String sentence) {
		int[] chars=new int[26];
		for (int i = 0; i < sentence.length(); i++) chars[sentence.charAt(i)-'a']++;
		for(int i=0; i<chars.length;i++)if(chars[i]<1)return false;
		return true;
	}

}
