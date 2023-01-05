package MathsForDSA;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeM1(36));
		System.out.println(isPrimeM2(36));

		for (int i = 2; i < 36; i++) {
			System.out.println(isPrimeM3(i));
		}


	}
	public static int isPrimeM3(int n) {
		boolean[] arr=new boolean[n+1];
		for (int i = 2; i*i <=n; i++) {
			if(!arr[i]) {
				for (int j = i*2; j < n; j+=i) {
					arr[j]=true;
				}
			}
		}
		int count=0;
		for (int i = 0; i < n; i++) {

			if(!arr[i]) {
				count++;}
		}
		return count;
	}



	public static boolean isPrimeM1(int n) {
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}


	public static boolean isPrimeM2(int n) {
		int c=2;
		if(c*c<=n) {
			if(n%c==0) {
				return false;
			}
		}
		return true;
	}
}
