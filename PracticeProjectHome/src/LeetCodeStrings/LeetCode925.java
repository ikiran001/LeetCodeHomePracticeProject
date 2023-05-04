package LeetCodeStrings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode925 {

	public static void main(String[] args) {
		String a="abcd";
		String b="aabbccdd";
		System.out.println(isLongPress(a, b));
	}
	public static  boolean isLongPressedName(String name, String typed) {
		Map<Character , Integer> map1=new HashMap<>();
		Map<Character , Integer> map2=new HashMap<>();
		for(char ch:name.toCharArray())map1.put(ch, map1.getOrDefault(ch, 0)+1);
		for(char ch:typed.toCharArray())map2.put(ch, map2.getOrDefault(ch, 0)+1);
		if(map1.size()>map2.size()) return false;
		else {
			for(char ch:map2.keySet()) {
				if(!map1.containsKey(ch))       return false;
				if(map1.get(ch)>map2.get(ch))	return false;	
			}
		}
		return true;

	}
	
	
	public static boolean isLongPress(String name, String typed) {

        int n = name.length();
        int m = typed.length();
        int i=0;
        int j=0;
        if(name.charAt(0) != typed.charAt(0)) //step 1
            return false;
        if(n>m){            // step 2
            return false;
        }
        while(i<n && j<m){    //step 3
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m){       //Step 4 & 5
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<n){      // step 6
            return false;
        }
        return true;  
	}

}
