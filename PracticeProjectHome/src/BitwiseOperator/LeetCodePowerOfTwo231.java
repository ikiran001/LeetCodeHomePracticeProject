package BitwiseOperator;
//231. Power of Two
//https://leetcode.com/problems/power-of-two/
public class LeetCodePowerOfTwo231 {

	public static void main(String[] args) {
System.out.println(isPowerOfTwo(15));

	} static boolean isPowerOfTwo(int n) {
    return (n&(n-1))==0;
}
	

}
