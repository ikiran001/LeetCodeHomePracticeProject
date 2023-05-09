package BitwiseOperator;
//find a single number from  given array
public class Xor {

	public static void main(String[] args) {

		int [] arr= {9,1,2,1,2,5,3,3,5};
		System.out.println(unique(arr));
	}

	private static int unique(int[] arr) {
		int unique=0;
		for(int n:arr) 
		{
			unique^=n;
		
		}
		return unique;
	}

}
