package InterviewPreperation;

public class ClassC extends ClassA {


	public static void main(String[] args) {

		ClassC objc=new ClassC();	
		objc.method1(1);
		objc.method2();

	
	}

	
	void method1(int a) {
		System.out.println("Class c methiod 1"+a);
	}

	void method2() {
		System.out.println("Class c method 2");
	}



}
