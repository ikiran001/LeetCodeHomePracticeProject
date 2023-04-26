package LeetCodeArrays;
//2457. Minimum Addition to Make Integer Beautiful
//https://leetcode.com/problems/minimum-addition-to-make-integer-beautiful/
public class LeetCode2457 {

	public static void main(String[] args) {
Long n=7345047123L;
int target=10;
System.out.println(makeIntegerBeautiful(n, target));

	}
	
	  
	  public static int sumOfDigits(long n) {
		  if(n==0) {
			  return 0;
		  }
		 return (int) (sumOfDigits(n/10)+(n%10));
	  }
	
	  public static long makeIntegerBeautiful(long n, int target) {
	        int i=1;
	        while(i>0) {
	        	if(sumOfDigits(n+i)>target) {
	        	i++;
	        	sumOfDigits(n+i);}
	        	else {return i;}
	        	
	        }
	        return i;
	        
	    }
	

}
