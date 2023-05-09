package LeetCodeStrings;

public class LeetCode2423 {

	public static void main(String[] args) {
		String word = "cccaaad";
		System.out.println(equalFrequency(word));
	}
	public static boolean equalFrequency(String word) {

		int c=0;
		int[] arr=new int[26];
		for (char a:word.toCharArray()) arr[a-'a']++;
		int i=0;
		while(arr[i]%2==0) {
			i++;
		}
		if(i==26)return false;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]%2!=0) {
				c++;
				if(c%2==0) {
					return false;
				}
			}
		}
		return true;
	}

}
