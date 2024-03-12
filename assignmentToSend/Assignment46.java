package assignmentToSend;

//Asssignment 46:Check any 2 strings are anagram or not
import java.util.Arrays;

public class Assignment46 {

	public static void main(String[] args) {

		String name1 = "cat";
		String name2 = "act";

		if (name1.length() != name2.length()) {
			System.out.println("not anagram");
		}

		else {
			char a[] = name1.toCharArray();
			char b[] = name2.toCharArray();

			Arrays.sort(a);
			System.out.println(a);
			Arrays.sort(b);
			System.out.println(b);

			boolean answer = Arrays.equals(a, b);
			System.out.println(answer);

			if (answer == true) {
				System.out.println("given Two string are anagram");
			}

			else {
				System.out.println("not anagram");
			}
		}

	}

}
