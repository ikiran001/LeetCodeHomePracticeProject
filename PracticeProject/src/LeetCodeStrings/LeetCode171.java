package LeetCodeStrings;

public class LeetCode171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("BQ"));
	}

	public static int titleToNumber(String columnTitle) {
		int length=columnTitle.length();
		char b=columnTitle.charAt(length-1);  //s
		for (int i = 0; i < 26; i++) {
			char excel=(char)('A'+i);
			if(String.valueOf(excel).equals(String.valueOf(b))) {
				int value=(26*(length-1))+(i+1);
				return value;
			}
		}
		return -1;		
	}

}
