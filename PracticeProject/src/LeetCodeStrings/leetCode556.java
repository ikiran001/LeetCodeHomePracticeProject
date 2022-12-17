package LeetCodeStrings;
//issue
//556. Next Greater Element III
//https://leetcode.com/problems/next-greater-element-iii/
public class leetCode556 {

	public static void main(String[] args) {
		int a=8765419;
		System.out.println(nextGreaterElement(a)); 

	}
	static int nextGreaterElement(int n) {
		String s=String.valueOf(n);
		char [] ch=s.toCharArray();
		int length=s.length();
		if(length==1) {
			return -1;
		}
		else  if(length==2 &&s.charAt(0)<s.charAt(1)) {
			swap(ch, 0, 1);

			return Integer.valueOf(charToString(ch));
		}
		else if(length==2 && s.charAt(0)==9) {
			return -1;
		}
		else if(s.charAt(0)>=s.charAt(1)) {
			findMin(ch);
			swap(ch, 0, findMin(ch));
			arrange(ch);
			charToString(ch);
			return Integer.valueOf(charToString(ch));

		}
		return -1;
	}


	static void arrange(char [] a) {
		for (int i = 1; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					swap(a, i, j);
				}
			}
		}

	}


	static char findMin(char[] s) {
		char min=s[1];

		for (int i = 2; i < s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[j]<min) {
					min=s[j];
				}
			}
		}
		return min;
		
	}

	static void swap(char[] s, int a, int b) {
		char temp=s[a];
		s[a]=s[b];
		s[b]=temp;

	}

	static String charToString(char[] a) {
		int n=a.length;
		String s="";
		for (int i = 0; i < n; i++) {
			s+=a[i];
		}
		return s;
	}


}
