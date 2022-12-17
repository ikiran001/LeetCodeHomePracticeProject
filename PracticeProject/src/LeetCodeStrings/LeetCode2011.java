package LeetCodeStrings;
//2011. Final Value of Variable After Performing Operations
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class LeetCode2011 {

	public static void main(String[] args) {
		String [] s=   {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(s));
	}
	static int finalValueAfterOperations(String[] operations) {
		int a=0;
		
		for (int i = 0; i < operations.length; i++) {

			if(operations[i].equalsIgnoreCase("--x") || operations[i].equalsIgnoreCase("x--")) {
				a-=1;
			}
			if(operations[i].equalsIgnoreCase("++x") || operations[i].equals("x++")) {
				a+=1;
			}


		}
		return a;

	}
}
