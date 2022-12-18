package LeetCodeArrays;

public class LeetCode04 {

	public static void main(String[] args) {
		int [] nums1= {1,2};
		int [] nums2= {3,4,5};
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}


	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int [] ans=new int[nums1.length+nums2.length];
		int i=0;
		int j=0;
		int k=0;
		int n=ans.length;

		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				ans[k]=nums1[i];
				i++;
			}
			else {
				ans[k]=nums2[j];
				j++;

			}
			k++;	
		}

		while(i<nums1.length) {
			ans[k]=nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length) {
			ans[k]=nums2[j];
			j++;
			k++;
		}
		int mI=n/2;
		if(n%2==0) {

			double a=ans[mI-1];
			double b=ans[mI];

			return (a+b)/2;

		}
		else return ans[mI];


	}
}

