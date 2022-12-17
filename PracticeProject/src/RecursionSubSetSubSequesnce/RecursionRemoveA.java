package RecursionSubSetSubSequesnce;

public class RecursionRemoveA {

	public static void main(String[] args) {
		String a="aaaaf";
		skip2(a);
		System.out.println(skip2(a));
		//System.out.println(removeA("abababababa"));

	}

	public static String removeA(String abc) {
		String ans="";
		int l=abc.length();
		for (int i = 0; i < l; i++) {
			if(abc.charAt(i)=='a') {}
			else ans+=abc.charAt(i);
		}
		return ans;
	}


	//========================//========================//========================//========================//========================//========================


	public static void skip(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch=up.charAt(0);
		if(ch=='a') {
			skip(p, up.substring(1));
		}
		else {
			skip(p+ch, up.substring(1));
		}

	}

	//========================//========================//========================//========================//========================//========================

	public static String skip2(String up) {
		if(up.isEmpty()) {
			return "";
		}
		char ch=up.charAt(0);
		if(ch=='a') {
			return skip2(up.substring(1));
		}
		else {
			return ch+ skip2(up.substring(1));
		}
	}


}

















