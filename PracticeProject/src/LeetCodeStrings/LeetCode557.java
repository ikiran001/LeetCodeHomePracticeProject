package LeetCodeStrings;

public class LeetCode557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	static String reverseWords(String s) {
	
		String b="";
		String[] a=s.split(" ");
		int n=a.length;
		for (int i = 0; i < n; i++) {
			char[] v= a[i].toCharArray();
			
			for (int j = a[i].toCharArray().length-1; j >=0 ; j--) {
				b+=v[j];
			}
		}
		return b;
	}
}
		