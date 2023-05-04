package LeetCodeStrings;

public class LeetCode1935 {

	public static void main(String[] args) {
	String a="leet code";
	String b="e";
	System.out.println(canBeTypedWords(a, b));

	}

	public static int canBeTypedWords(String text, String brokenLetters) {
		String[] arr=text.split(" ");
		int c=0;
		for(String s: arr) {
			for(char ch: brokenLetters.toCharArray()) {
			if (s.contains(String.valueOf(ch))) {
				c++;
				break;
			}
			}
		}
		return arr.length-c;
		

	}
}
