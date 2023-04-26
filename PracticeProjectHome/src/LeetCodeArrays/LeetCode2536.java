package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2536 {

	public static void main(String[] args) {
	int [][] queries= {{1,1,2,2},{0,0,1,1}};
	System.out.println(rangeAddQueries(3, queries));

	}
	
	public static int[][] rangeAddQueries(int n, int[][] queries) {
        int [][] arr=new int[n][n];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<queries[0].length;j++){
                list.add(queries[i][j]);
            }
        }
        int start=0;
      
        
        while(start<list.size()-3){
        	  int end=start+2;
              int xStart=start+1;
              int xend=end+1;
        for(int x=list.get(start);x<=list.get(end);x++){
            for(int y=list.get(xStart); y<=list.get(xend);y++){
                arr[x][y]+=1;
            }  
        }
            start+=4;
    }
        
        return arr;
    }

}
