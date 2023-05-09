package LinearSearch;

public class LeetCodeCountEvenNumFromArray {

	public static void main(String[] args) {
		int[] arr= {12,444,123,2334,1,33};
		System.out.println(findEvenNumber(arr));

	}

	static int findEvenNumber(int[] nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count ++;
			}
		}
		return count;
	}

	static boolean even(int num) {
		int noOfDigits=digits(num);
		if(noOfDigits%2==0) {
			return true;
		}
		return false;
	}

	static int digits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;

		}
		return count;
	}



}
