package ArraysANDStringsss;
import java.util.*;
public class ListList2Anagram {

	public static void main(String[] args) {
		List<List<String>> list=new ArrayList<>();
		String[] a= {"abc" , "bac" , "ssd", "dss" , "qwe","ewq","asdf","bca" };
		System.out.println(listOfAnagram(a, list));
	}
	public static List<List<String>> listOfAnagram(String[] a,List<List<String>> list){
		List<String> small=null;
		for (int i = 0; i < a.length; i++) {
			small=new ArrayList<>();
			for (int j = i; j < a.length; j++) {
				if( isAnagram1(a[i], a[j])) {
					small.add(a[j]);	
				}
			}
			if(!small.isEmpty())list.add(small);
		}
		return list;
	}

	public static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length()) return false;
		Map<Character, Integer> map1=new HashMap<>();
		Map<Character, Integer> map2=new HashMap<>();
		for(char ch1:a.toCharArray()) map1.put(ch1, map1.getOrDefault(ch1, 0)+1);	
		for(char ch1:b.toCharArray()) map2.put(ch1, map2.getOrDefault(ch1, 0)+1);
		for(char ch: map1.keySet()) {
			if(map1.get(ch)!=map2.get(ch)) {
				return false;	
			}	
		}
		return true;
	}

	public static boolean isAnagram1(String a, String b) {
		if(a.length()!=b.length()) return false;
		char[] arr1=a.toCharArray();
		char[] arr2=b.toCharArray();
		Arrays.sort(arr1);Arrays.sort(arr2);
		return	Arrays.equals(arr1,arr2);
	}
}
