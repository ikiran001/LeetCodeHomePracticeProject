package LeetCodeStrings;

import java.util.Objects;

public class LeetCode2515 {

	public static void main(String[] args) {
		String[] a= {"pgmiltbptl","jnkxwutznb","bmeirwjars","ugzyaufzzp","pgmiltbptl"
				+ "","sfhtxkmzwn","pgmiltbptl","pgmiltbptl","onvmgvjhxa","jyzdtwbwqp"};
		String target="pgmiltbptl";
		System.out.println(closetTarget(a, target, 4));

	}
	public  static int closetTarget(String[] words, String target, int startIndex) {
		int x=0;
		int a=0;
		while(x<words.length) {
			if(Objects.equals(words[x], target) && x==startIndex) {
					return 0;
			}
			else {
				x++;
			}
		}
		
		int k=0;
		while(k<words.length) {
			if(Objects.equals(words[k], target)) {
				int c=0;
				int rc=0;
				int i;
				for ( i = startIndex+1; i < words.length; i++) {
					c++;
					if(Objects.equals(words[i], target)) {
						break;
					}
					else {}
				}
				if(i>words.length-1) {
					for (int j = 0; j < startIndex; j++) {
						c++;
						if(Objects.equals(words[j], target)) {
							break;
						}
					}
				}
				int j;
				for (j = startIndex-1; j >= 0; j--) {
					rc++;
					if(Objects.equals(words[j], target)) {
						break;
					}
					else {}
				}
				if(j==-1) {
					for (j = words.length-1; j >=startIndex ; j--) {
						rc++;
						if(Objects.equals(words[j], target)) {
							break;
						}
					}
				}
				return Math.min(rc, c);
			}
			else {
				k++;
			}
		}
		return -1;	

	}
}
