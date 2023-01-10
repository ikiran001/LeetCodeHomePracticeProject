package InterviewPreperation;

public class IN {

	public static void main (String args[])   
	{  
		//System.out.println(superDigit("9875", 4));
		System.out.println(integerReplacement(65535));

	} 
	public static int superDigit(String n, int k) {
		String s="";
		for (int i = 0; i < k; i++) {
			s+=n;
		}
		return superDigitHelper(s, k);
	}
	public static int superDigitHelper(String n, int k) {

		if(n.length()==1){
			return Integer.valueOf(n); 
		}
		Long temp=Long.valueOf(n);
		int sum=0;
		while(temp>0) {
			Long mod=temp%10;
			sum+=mod;
			temp/=10;
		}
		String a=String.valueOf(sum);
		k=a.length();
		return superDigitHelper(a, k);
	}

	
	
	public static int integerReplacement(int n) {
		
		return helper(n, 0);
	}
	
	
	public static int helper(int n, int count) {
		if(n==1) {
			return count;
		}
		if(n%2==0) {
			n/=2;
			count++;
			return helper(n, count++);
		}
		else {
			n-=1;
			count++;
			return helper(n, count++);
		}

	}
}



