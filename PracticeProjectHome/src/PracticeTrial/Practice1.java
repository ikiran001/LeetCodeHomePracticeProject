package PracticeTrial;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {
		String s="Kiran Jadhav kk jj vv";
		System.out.println(reverse(s));
	}

	public static int reverse(String s) {
		s=s.replaceAll(" ", "");
		int i=0;
		Map<Character, Integer> map=new HashMap<>();
		for(char ch: s.toCharArray()) 
			map.put(ch, map.getOrDefault(ch, 0)+1);
		for(char ch: map.keySet()) {
			if(map.get(ch)>1) {
				System.out.println(ch);
				i++;
			}
		}
		return i;

	}

}
