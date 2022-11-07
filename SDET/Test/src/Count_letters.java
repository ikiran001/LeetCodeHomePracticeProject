import java.util.LinkedHashMap;
import java.util.Map;

public class Count_letters {

	public static Map<Character, Integer> countLetter(String str) {

		Map<Character, Integer> letters = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (letters.containsKey(ch)) {
				letters.put(ch, letters.get(ch) + 1);

			} else {
				letters.put(ch, 1);

			}
		}

		return letters;

	}

	public static void main(String[] args) {

		String a = "Ganesh Abasaheb Kashid";
		System.out.println("countLetter(a) : " + countLetter(a));
		// countLetter(a);

	}

}
