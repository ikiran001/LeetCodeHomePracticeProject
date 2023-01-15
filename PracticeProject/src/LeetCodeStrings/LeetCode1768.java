package LeetCodeStrings;

public class LeetCode1768 {

	public static void main(String[] args) {
String s1="ab";
String s2="pqrs";
System.out.println(mergeAlternately(s1, s2));
	}
public static String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        String s="";
        int i=0;
        for ( i = 0; i < l1; i++) {
			if(i<l2) {
				s+=word1.charAt(i);
				s+=word2.charAt(i);
			}
			else {
				s+=word1.charAt(i);
			}
		}
        for(int j=i; j<l2;j++) {
        	s+=word2.charAt(j);
        }
        
     
return s;
        
    }
}
