package PracticeTrial;

public class ReplaceAllSpecialChar {

	public static void main(String[] args) {
		String test = "1";
		String anc=test.replaceAll("[\\d]", "a");
		System.out.println(anc);
		String[] ans=anc.split(" ");
	//	System.out.println(findMAxLength(ans));
	}

	public static String findMAxLength(String [] ans) {
		int max=ans[0].length();
		int i;
		for ( i = 1; i < ans.length-1; i++) {
			if(ans[i].length()>max) {
				max=ans[i].length();
			}
		}
		return ans[i];
	}
}
