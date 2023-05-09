package RecursionSubSetSubSequesnce;

public class RecursionSubStringRemoveApple {

	public static void main(String[] args) {
		String a="asdasappleasdsad";
		System.out.println(a);
		System.out.println(skip(a));

	}

	public static String skip(String up) {
		if(up.isEmpty()) {
			return "";			
		}
		if(up.startsWith("apple")) {
			return skip(up.substring(5));
		}
		else {
			return up.charAt(0)+skip(up.substring(1));
		}
	}

}
