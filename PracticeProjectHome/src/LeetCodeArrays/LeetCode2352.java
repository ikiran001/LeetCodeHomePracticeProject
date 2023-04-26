package LeetCodeArrays;

import java.util.Objects;

public class LeetCode2352 {

	public static void main(String[] args) {


	}
	
	  public int equalPairs(int[][] grid) {
	        int count=0;
	        for (int i = 0; i < grid.length; i++) {
	        	String a="";
				for (int j = 0; j < grid[i].length; j++) {
					a+=grid[i][j];
				}
				for (int j = 0; j < grid.length; j++) {
					String b="";
					for (int j2 = 0; j2 < grid[j].length; j2++) {
						b+=grid[j2][j];
					}
					if(Objects.equals(a, b)) {
						count++;
					}
				}
			}
	        return count;
	    }

}
