package PracticeTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
int a;
String b;


public Practice() {
	this.a=1;
	this.b="Krian";
}


	public static void main(String[] args) {
		int n=1;
		int []arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=n;
			n++;
		}
		
		System.out.println(Arrays.toString(arr));
		int mid=(arr.length-1)/2;
		System.out.println(arr[mid]);
		
//		String a="kiran";
//		String b="kiran";
//		System.out.println("== method "+a==b);
//		System.out.println(".equals() "+a.equals(b));
//		a.length();
//		System.out.println("subsequence "+a.subSequence(1, 3));
//		System.out.println("substring "+a.substring(1));
//	
//		a.concat(b);
//		System.out.println("ans"+a);
//		Practice p=new Practice();
//		
//		System.out.println(p.a+"  "+p.b);
//	
//		int [] arr=new int[3];
//		int [] by=Arrays.copyOf(arr, arr.length);
//		System.out.println(Arrays.toString(by));
//		
//		List<Integer> list=new ArrayList<>();
//		list.add(123);
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
 //System.out.println("listEquels  "+list.equals(a));
		
		
//		String a="kiran";
//		String b="krian";
//		System.out.println(a);
//		a="jadhav";
//		System.out.println(a);
//		System.out.println(a.equals(b));
	}



}
