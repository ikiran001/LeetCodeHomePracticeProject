package LeetCodeStrings;

public class LeetCode43 {

	public static void main(String[] args) {
		String a="123456789";
		String b="987654321";
		System.out.println(multiply(a, b));

	}
	static String multiply(String num1, String num2) {
return 		String.valueOf(Long.valueOf(num1)*Long.valueOf(num2));

	}
}