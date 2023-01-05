package HashMapHashSet;
import java.util.*;

public class LeetCode350 {

	public static void main(String[] args) {

		int[] arr1= {1,2,2,1};
		int[] arr2= {2,2};
		int[] ans=intersect(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}  

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list=new ArrayList<>();
		List<Integer> ans=new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if(list.contains(nums2[i])) {
				ans.add(nums2[i]);
				int j=0;
				while(j<nums1.length) {
					if(list.get(j)==nums2[i]) {
						list.remove(j);
						break;
					}
					else {j++;}
				}
			}
		}
		
		
		int [] arr=new int[ans.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ans.get(i);
		}
		return arr;
	}
	
	//********************************************************************************************
	
	  public int[] intersec2(int[] nums1, int[] nums2) {
	        // Sort both the arrays first...
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        // Create an array list...
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        // Use two pointers i and j for the two arrays and initialize both with zero.
	        int i = 0, j = 0;
	        while(i < nums1.length && j < nums2.length){
	            // If nums1[i] is less than nums2[j]...
	            // Leave the smaller element and go to next(greater) element in nums1...
	            if(nums1[i] < nums2[j]) {
	                i++;
	            }
	            // If nums1[i] is greater than nums2[j]...
	            // Go to next(greater) element in nums2 array...
	            else if(nums1[i] > nums2[j]){
	                j++;
	            }
	            // If both the elements intersected...
	            // Add this element to arr & increment both i and j.
	            else{
	                arr.add(nums1[i]);
	                i++;
	                j++;
	            }
	        }
	        // Create a output list to store the output...
	        int[] output = new int[arr.size()];
	        int k = 0;
	        while(k < arr.size()){
	            output[k] = arr.get(k);
	            k++;
	        }
	        return output;
	    }

}
