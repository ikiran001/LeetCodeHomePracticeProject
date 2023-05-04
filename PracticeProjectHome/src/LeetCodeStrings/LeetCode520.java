package LeetCodeStrings;

public class LeetCode520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean detectCapitalUse(String word) {
		int count=0;
		for(char c:word.toCharArray()) if (Character.isUpperCase(c))count++;
		if (count==word.length()) return true;
		if (count==0) return true;
	    if (Character.isUpperCase(word.charAt(0)) && count<2) return true;

		return false;
	}

}
