package PracticeTrial;

public class RecursioTrial {

	
	public static void main(String [] args) {
		recursion();
	}
	
	public static void recursion() {
		System.out.println("L1");
		recursion1();
		System.out.println("L2");
		
	}
	public static void recursion1() {
		System.out.println("L3");
		recursion2();
		System.out.println("L4");
		
	}
	public static void recursion2() {
		System.out.println("L5");
		
	}
}
