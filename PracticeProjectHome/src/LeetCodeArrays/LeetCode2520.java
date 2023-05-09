package LeetCodeArrays;

public class LeetCode2520 {

	public static void main(String[] args) {
System.out.println(countDigits(121));
	}
	  public static int countDigits(int num) {
	        int x=num;
	        int count=0;
	        while(num>0) {
	        	int mod=num%10;
	        	if(x%mod==0) {
	        		count++;
	        		num/=10;
	        	}
	        	else {
	        		num/=10;
	        	}
	        }
	        return count;
	        
	    }
}
