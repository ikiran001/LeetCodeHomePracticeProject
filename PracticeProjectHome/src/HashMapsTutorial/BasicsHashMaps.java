package HashMapsTutorial;

import java.util.*;

//hashMaps are unordered 

public class BasicsHashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> mp=new HashMap<>();
		mp.put("India", 120);
		mp.put("China", 220); 
		mp.put("Australia", 320);
		mp.put("Japan", 520);
		System.out.println(mp);
		
		
//******************************************************************************************************************************
		//.contains("key")
		if(mp.containsKey("India")) {
			System.out.println(" is present");
		}
		else {
			System.out.println(" is not present");
		}
	
//**********************************************************************************************		
	   //.get("key")
		
		System.out.println(mp.get("India"));// It will print its value
		System.out.println(mp.get("asdsad"));// key doesn't exist will print null

		
//********************************************************************************************************
		
		//TO print arr
	int [] arr= {12,213,32};
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	for(int val : arr) {
		System.out.print(val+" ");
	}
	System.out.println();
	
	
	//
	System.out.println();
	System.out.println();
	for(Map.Entry<String, Integer> e:mp.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
		
	}
	
	}
	

	



}


