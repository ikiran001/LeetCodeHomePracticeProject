package LeetCodeStrings;


public class LeetCode3 {

	public static void main(String[] args) {
		String s="vdvf";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
		
		String p="";
		if(s.length()==0){
			return p.length();
		}
		int index;
		if(s.length()>1) {
			index=1;
		}
		else {index=0;}
		for (int i = 0; i < s.length(); i++) {
			if(!p.contains(String.valueOf(s.charAt(i)))) {
				p+=s.charAt(i);
			}
			else {
				return Math.max(p.length(), lengthOfLongestSubstring(s.substring(index)));
			}
		}
		return p.length();
	}

}
