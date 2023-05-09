package LeetCodeStrings;

public class LeetCode1910 {

	public static void main(String[] args) {
		String s="axxxxyyyyb";
		String part="xy";
		System.out.println(removeOccurrences(s, part));
	}

	public static String removeOccurrences(String s, String part) {
		if(!s.contains(part))return s;
		StringBuilder sb=new StringBuilder(s);
		int a=s.length();
		int b=part.length();
		for (int i = 0; i <a ; i++) {
			int j=0;
			while(j<b && s.charAt(i+j)==part.charAt(j)) {
				j++;
				if(j==b) {
					sb.delete(i, i+j);
					return removeOccurrences(sb.toString(), part);
				}
			}
		}
		return s;
	}
}
