package LeetCodeStrings;

public class LeetCode1668 {

	public static void main(String[] args) {
		String a="acababac";
		String b="ac";
		System.out.println(maxRepeating1(a, b));
	}



	public static int maxRepeating1(String sequence, String word) {
		int c=0;
		String add=word;
		while(sequence.contains(word)==true)
		{
			c+=1;
			word=word+add;
			//System.out.println(word);
		}
		return c;
	}
}
