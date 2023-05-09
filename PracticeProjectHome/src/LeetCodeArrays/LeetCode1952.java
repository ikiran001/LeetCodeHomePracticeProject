package LeetCodeArrays;
///1952. Three Divisors
//https://leetcode.com/problems/three-divisors/description/
public class LeetCode1952 {

	public static void main(String[] args) {
int n=2;
System.out.println(isThree(n));

	}

	public static boolean isThree(int n) {
		int i=1;
		int count=0;
		while(i<=n) {
			if(n%i==0) {
				count++;
				i++;
			}
			else {i++;}
		}
		
		if(count==3) {
			return true;
		}
		else	return false;
	}
}


