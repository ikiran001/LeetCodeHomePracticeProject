package LeetCodeArrays;

public class LeetCode81 {

	public static void main(String[] args) {
		int[] arr= {2,5,6,0,0,1,2};
		System.out.println(search(arr, 0));

	}

	public static boolean search(int[] nums, int target) {

		int start=nums[0];

		int pivot=findpivot(nums);
		if(pivot==-1) {
			return	binarySearch(nums, 0, nums.length-1, target);
		}
		if(pivot==target) {
			return true;
		}
		if(target>=start) {
			return binarySearch(nums, 0, pivot, target);

		}
		else {
			return binarySearch(nums, pivot, nums.length-1, target);
		}

	}

	public static int findpivot(int[] arr) {


		int start=0;
		int end=arr.length-1;


		if(arr[start]==arr[end] && arr[start+1]==arr[end-1]) {
		return	findMax(arr);
		}else {
			while(start<=end) {
				int mid=start+((end-start)/2);

				if(mid<end && arr[mid]>arr[mid+1]) {
					return mid;
				}
				if(mid>start &&  arr[mid-1]>arr[mid]) {
					return mid-1;
				}
				if(arr[mid]>arr[start]) {
					start=mid+1;
				}
				else{
					end=mid-1;
				}
			}}
		return -1;
	}

	public static boolean binarySearch(int[] arr , int start, int end , int target) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return true;
			}
			if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return false;
	}

	public static int findMax(int[] arr) {
		int  max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}

		}
		return max;
	}



}
