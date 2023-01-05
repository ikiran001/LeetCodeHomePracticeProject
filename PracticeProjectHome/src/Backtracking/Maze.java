package Backtracking;



public class Maze {

	public static void main(String[] args) {
		System.out.println(count(4, 4));
		path("", 3, 3);
	}

	public static int count(int r , int c) {
		if(r==1 || c==1) {
			return 1;
		}

		int lhs=count(r-1, c);
		int rhs=count(r, c-1);
		return lhs+rhs;

	}


	//++++++++++++	//++++++++++++	//++++++++++++	//++++++++++++	//++++++++++++	//++++++++++++	//++++++++++++	//++++++++++++


	public static void path(String p, int r, int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}

		if(r>1) {
			path(p+'D', r-1, c);
		}
		if(c>1) {
			path(p+'R', r, c-1);
		}
	}
}

