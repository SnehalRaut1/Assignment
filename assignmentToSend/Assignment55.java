package assignmentToSend;
//Assignment 55: Print the numbers from 1 to 1000, if the number is divisible by 3 print "sun" and if number
//is divisible by 5 then print "moon",and again if the both numbers divisible (3&5) print "sun and moon" 
public class Assignment55 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.println(i + " sun");
			}
			if (i % 5 == 0) {
				System.out.println(i + " moon");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " sun and moon");
			}

		}
	}
}
