package assignmentToSend;
//Assignment 14: Write a program for NOT with AND and NOT with OR operator 
public class Not_With_And {
	
	public static void main(String[] args) {
		
		int age=22;
		String gender="Female";
		
		if(!(age>18 && gender=="Female" ) )
		{
			System.out.println("Marriage");
		}
		
		else
		{
			System.out.println("study");
		}
		
	}

}
