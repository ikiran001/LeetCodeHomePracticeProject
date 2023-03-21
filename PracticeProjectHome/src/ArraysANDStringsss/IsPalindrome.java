package ArraysANDStringsss;

public class IsPalindrome {

	public static void main(String[] args) {
		String abc="abcadsdscba";
		System.out.println(isPalindrome(abc));

	}

	public static boolean isPalindrome(String str) {
		int s=0;
		int e=str.length()-1;
		while(s<e) {
			if(str.charAt(s)==str.charAt(e)) {
				s++;
				e--;
			}
			else {
				return false;
			}
		}
		return true;



	}

}
