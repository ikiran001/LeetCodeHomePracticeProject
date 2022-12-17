package LeetCodeRecursion;

public class leetCodeFibonacci {

	public static void main(String[] args) {

		
		 for (int i = 0; i <40; i++) { System.out.println(fibo(i));
		 }
		 
		System.out.println(fibo2(50));
		System.out.println(fibo(50));

	}

	public static int fibo2(int n) {
	 return (int)((Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5)));
	}
 
	public static int fibo(int n) {
		while(n<2) {
			return n; 
		}
		return fibo(n-1)+fibo(n-2);
	}

}
