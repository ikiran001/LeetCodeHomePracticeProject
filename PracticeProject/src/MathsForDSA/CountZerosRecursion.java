package MathsForDSA;

public class CountZerosRecursion {

	public static void main(String[] args) {
		int n =0 ;
		System.out.println(zeros(n));

	}
	static int zeros(int n) {
		return countMethod(n,0);
	}


	static int countMethod(int n, int count) {
		if(n==0) {
			return count;
		}
		int rem=n%10;
		if(rem==0) {
			return countMethod(n/10, count+1);
		}
		else return countMethod(n/10, count);
	}


}
