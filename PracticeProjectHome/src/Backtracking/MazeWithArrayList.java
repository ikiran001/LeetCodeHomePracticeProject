package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeWithArrayList {

	public static void main(String[] args) {
		System.out.println(pathReturn("", 3, 3));

	}

	public static List<String> pathReturn(String p, int r, int c){	
		if(r==1 && c==1) {
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}

		List<String> ans=new ArrayList<>();
		if(r>1) {
			ans.addAll(pathReturn(p+'D', r-1, c));
		}
		if(c>1) {
			ans.addAll(pathReturn(p+'R', r, c-1));
		}
		return ans;
	}

}
