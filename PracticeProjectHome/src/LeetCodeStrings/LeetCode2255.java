package LeetCodeStrings;

public class LeetCode2255 {

	public static void main(String[] args) {
		String[] ar= {"a","b","c","ab","bc","abc"};
		System.out.println(countPrefixes(ar, "abc"));
	}

	public static  int countPrefixes(String[] words, String s) {
		int c=0;
		for(String word: words) {
			if(s.startsWith(word)) c++; 
		}
		return c;
	}
}
