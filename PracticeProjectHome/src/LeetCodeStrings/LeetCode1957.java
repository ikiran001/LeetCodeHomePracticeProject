package LeetCodeStrings;

public class LeetCode1957 {

	public static void main(String[] args) {
		String s="abbcccddddeeeee";
		System.out.println(makeFancyString(s));
	}	


	public static String makeFancyString(String s) {
		StringBuilder sb=new StringBuilder(s);
		for (int i = 0; i < sb.length()-2; i++) {
			if(sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i)==sb.charAt(i+2)) {
				sb.deleteCharAt(i--);
			}
		}
		return sb.toString();
	}
}
