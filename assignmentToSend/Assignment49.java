package assignmentToSend;

//Assignment 49: In a string "sky is 441 !@#" find out the number of special character,alphabet,numeric,
//spaces we have
public class Assignment49 {
	public static void main(String[] args) {
		String name = "sky is 441 !@#";

		char a[] = name.toCharArray();

		int count_of_alpha = 0;
		int count_of_numeric = 0;

		int count_of_space = 0;

		for (int i = 0; i < name.length(); i++) {
			boolean answer1 = Character.isAlphabetic(a[i]);
			boolean answer2 = Character.isDigit(a[i]);
			boolean answer3 = Character.isSpaceChar(a[i]);

			if (answer1 == true) {
				count_of_alpha++;
			}
			if (answer2 == true) {
				count_of_numeric++;
			}
			if (answer3 == true) {
				count_of_space++;
			}

		}

		System.out.println("count of alpha is " + count_of_alpha);
		System.out.println("count of numeric is " +count_of_numeric);
		System.out.println("count of space is " +count_of_space);
		
		int count_of_specialChar=name.length()-(count_of_alpha+count_of_numeric+count_of_space);
        System.out.println("count of specialChar is " +count_of_specialChar);
	}
}
