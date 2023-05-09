	package Backtracking;

public class MazeRiverSum {

	public static void main(String[] args) {
		boolean [][] arr={{true,true,true},
				{true,true,false},
				{true,true,true}};

		mazeRiver(arr, 0, 0, "");

	}

	public static void mazeRiver(boolean[][] arr, int r, int c, String s) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			System.out.println(s);
			return;
		}

		if(!arr[r][c]) {
			return;
		}

		if(r<arr.length-1){
			mazeRiver(arr, r+1, c, s+'D');
		}
		if(c<arr[0].length-1) {
			mazeRiver(arr, r, c+1, s+'R');
		}

	}

}
