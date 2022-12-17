package MathsForDSA;

public class LeetCode69 {

	public static void main(String[] args) {
System.out.println(mySqrt(17));

	}
	 static int mySqrt(int x) {
			long start=0;
			long end=x;
		//	long ans=0;
			while(start<=end){
				long mid=start+(end-start)/2;
				if(mid*mid>x) {
					end=(int) (mid-1);
					//ans=(int) mid;

				}
				else if(mid*mid<x) {
					start=(int) (mid+1);
					
				}
				else {
					return  (int) mid;
				}
			}
			return (int) end;

		
		

		    }

}
