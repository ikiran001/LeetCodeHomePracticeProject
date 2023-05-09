package LeetCodeStrings;

public class LeetCode1903 {

	public static void main(String[] args) {
String a="4206";
System.out.println(largestOddNumber(a));

	}

	public static String largestOddNumber(String num) {
		
		
		int len=num.length();
		int n=Integer.valueOf(num);
		if(n%2!=0) {
			return String.valueOf(n);
		}
		int c=0;
		int max=0;
		while(n>0) {
			int mod=n%10;
			if(mod%2==0) {
				c++;
				if(c==len) {
					return "";
				}
			}
			else {
				if(mod>max) {
					max=mod;
				}else {}
			}
			n=n/10;
			
		}
		return String.valueOf(max);

	}

}
