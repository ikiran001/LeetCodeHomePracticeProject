package RecursionSubSetSubSequesnce;

public class SkipAppNotApple {

	public static void main(String[] args) {
		String a="appasdsadappleasd";
		System.out.println(skipapponly(a));
	}

	public static String skipapponly(String up) {
	
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skipapponly(up.substring(3));
		}
		else {
			return up.charAt(0)+ skipapponly(up.substring(1));
		}
	}

}
