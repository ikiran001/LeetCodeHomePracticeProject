import java.util.regex.Pattern;

public class IntCountStr {

	public static void main(String[] args) {

		String name = "123ganesh123";
		String temp = name.replaceAll("[\\D]", "");
		// System.out.println(temp);

		int no = Integer.parseInt(temp);
		// System.out.println(no);

		int sum = 0;
		int temp1 = 0;
		while (no != 0) {
			temp1 = no % 10;
			no = no / 10;

			sum = sum + temp1;
		}
		System.out.println(sum);

	}
}
