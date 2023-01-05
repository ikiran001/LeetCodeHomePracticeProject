package PracticeTrial;



public class InterviewQ {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(ShootRangeByKiran(11,arr));

	}



	//********************************************************************************************

	public static int ShootRangeByKiran(int N, int[] arr) {
		int sum=0;
		if(N==1) {
			return sum;
		}

		int [] newArray=new int [arr.length/2];
		int j=0;
		for (int i = 0; i < arr.length; i+=2) {
			if(i<arr.length-1) {
				newArray[j]=arr[i+1];
				sum+=arr[i];
				j++;}
			else{sum+=arr[i];}
			N--;
		}

		return sum+ShootRangeByKiran(N, newArray);
	}






}


