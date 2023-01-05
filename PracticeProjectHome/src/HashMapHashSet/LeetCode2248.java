package HashMapHashSet;
import java.util.*;
public class LeetCode2248 {

	public static void main(String[] args) {

int [][] arr= {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
System.out.println(intersection3(arr));
	}
	public List<Integer> intersection(int[][] nums) {
		List<Integer> list= new ArrayList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if(!map.containsKey(nums[i][j])) {
					map.put(nums[i][j], 1);
				}
				else {
					map.put(nums[i][j], map.get(nums[i][j])+1);
				}

			}
			for(int key : map.keySet()) {
				if(map.get(key)==nums.length) {
					list.add(key);
				}
			}
		}

		Collections.sort(list);
		return list;
	}
	
	//********************************************************************************************
    public static List<Integer> intersection3(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        
        int[] count = new int[1001];
        
        for(int[] arr : nums) {
            for(int i : arr) {
                count[i]++;
            }
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] == nums.length) {
                ans.add(i);
            }
        }
        return ans;
    }
}

