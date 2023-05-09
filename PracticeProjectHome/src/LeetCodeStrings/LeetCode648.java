package LeetCodeStrings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode648 {

	public static void main(String[] args) {
		String [] a= {"a","b","c"};
		List<String> list=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		String b="aadsfasf absbs bbab cadsfafs";
		System.out.println(replaceWords(list, b));

	}

	public static String replaceWords(List<String> dictionary, String sentence) {
		String ans="";
		String[] sen=sentence.split(" ");
		for (int i = 0; i < dictionary.size(); i++) {
			int len=dictionary.get(i).length();
			for (int j = 0; j < sen.length; j++) {
				if(sen[j].length()>len && sen[j].
				substring(0, len).contains(dictionary.get(i))) {
					sen[j]=dictionary.get(i);
				}
			}
		}
		for (int i = 0; i < sen.length; i++) {
			ans+=sen[i]+" ";	
		}
		return ans.trim();
	}
}
