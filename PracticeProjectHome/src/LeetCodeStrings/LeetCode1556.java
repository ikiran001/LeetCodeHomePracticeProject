package LeetCodeStrings;

public class LeetCode1556 {

	public static void main(String[] args) {
		int n=123;
		System.out.println(thousandSeparator(n));

	}
	public static String thousandSeparator(int n) {

		String a="";
		String w=String.valueOf(n);
		int c=0;
		for (int i = w.length()-1; i >=0; i--) { 
			a+=w.charAt(i);c++;
			if(c==3) {
				a+=".";
				c=0;
			}
		}
		StringBuilder s=new StringBuilder(a);
		String ans=s.reverse().toString();

		if(ans.charAt(0)=='.') {
			return ans.substring(1);		
		}
		else {return ans;}
	}

}
