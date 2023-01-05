package LeetCodeStrings;



//2000. Reverse Prefix of Word
//https://leetcode.com/problems/reverse-prefix-of-word/
public class LeetCode2000 {

	public static void main(String[] args) {
		String word = "adsaszzzzz";char ch = 'z';
		System.out.println(reversePrefix(word, ch));
	}

	static String reversePrefix(String word, char ch) {
		String a="";
		int index=0;
		int length=word.length();
		for (int i = 0; i < length; i++) {
			if(word.charAt(i)==ch) {
				index=i;	
				break;
			}	
		}
		if(index==0) {
			return word;
		}
		else {
			for (int i = index; i >=0; i--) {
				a+=word.charAt(i);
			}
			for (int i = index+1; i < length; i++) {
				a+=word.charAt(i);
			}
			return a;
		}
	}
}
