package assignmentToSend;
//Assignment 14: Write a program for NOT with AND and NOT with OR operator 

public class NOT_With_OR {

	public static void main(String[] args) {

		int age = 22;
		String gender = "Female";

		if (!(age > 25 || gender == "Female"))
		{
			System.out.println("1");

		} 
		else
		{
			System.out.println("2");
		}

	}
}
