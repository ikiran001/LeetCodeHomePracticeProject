package LeetCodeStrings;

public class LeetCode657 {

	public static void main(String[] args) {
		String moves = "RRDD";
		System.out.println(judgeCircle(moves));

	}
	static boolean judgeCircle(String moves) {
		int count=0;
		int countud=0;
		String[] args=moves.split("");
	
		for (int i = 0; i < args.length; i++) {
			if(args[i].contains("U")) {
				countud++;
			}
			else if(args[i].contains("D")) {
				countud--;
			}
			else if(args[i].contains("R")) {
				count++;
			}
			else {count--;
			}
		}
		if(count==0 && countud==0) {
			return true;
		}
		return false;
	}
}


/*
 * public class Solution { public boolean judgeCircle(String moves) { int x = 0;
 * int y = 0; for (char ch : moves.toCharArray()) { if (ch == 'U') y++; else if
 * (ch == 'D') y--; else if (ch == 'R') x++; else if (ch == 'L') x--; } return x
 * == 0 && y == 0; } }
 */