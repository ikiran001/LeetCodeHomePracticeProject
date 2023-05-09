package LeetCodeRecursion;
//https://www.hackerrank.com/challenges/30-recursion/problem
public class HcakerRank09 {

	public static void main(String[] args) {

System.out.println(factorial(4));
	}

	public static int factorial(int n) {
	while(n==0){
			return 1;
		}
		return n*factorial(n-1);
		}
}
