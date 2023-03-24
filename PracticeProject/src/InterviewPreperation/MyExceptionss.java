package InterviewPreperation;

class MyExceptionss extends Exception {
	public MyExceptionss(String msg) {
		super(msg);
	}
}
class ab{
	public static void main(String[] args) {
		int a=10;
		try {
			if(a<10) {
				throw new MyExceptionss("less than 10");
			}
		} catch (MyExceptionss e	) {
			System.out.println(e.getStackTrace());
		}
	}
}

