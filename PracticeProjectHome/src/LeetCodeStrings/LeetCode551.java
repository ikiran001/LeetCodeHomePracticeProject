package LeetCodeStrings;

public class LeetCode551 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean checkRecord(String s) {
		int a=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A') {
				a++;
				if(a>1)return false;
			}
			if((i+2)<s.length() && s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L' ) {
				return false;
			}
		}
		return true;
	}
}
