package LeetCodeArrays;


public class LeetCode73 {

	public static void main(String[] args) {
		int [][] arr= {{1,0,1}
		,{1,0,1}
		,{4,2,1}};
		setZeroes(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void setZeroes(int[][] matrix) {

		int [][] arr=new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) { 
				arr[i][j]=matrix[i][j];
			}}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]==0) {
					int tempi=i;
					int tempj=j;
					while(i<matrix.length) {
						arr[i][j]=0;
						i++;
					}i=tempi;
					while(i>=0) {
						arr[i][j]=0;
						i--;
					}i=tempi;
					while(j<matrix[0].length) {
						arr[i][j]=0;
						j++;
					}j=tempj;
					while(j>=0) {
						arr[i][j]=0;
						j--;
					}j=tempj;

				}	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) { 
				matrix[i][j]=arr[i][j];
			}}



	}
}
