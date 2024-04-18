package assignmentToSend;
//Assignment_59: Write s program  for an exception with 5 catches and 1 finally block
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_59_Try_Catch_finally 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try
		{
			int a=s1.nextInt();
			
		}
		catch (ArithmeticException a1)
		{
			System.out.println("exception 1");
		}
		
		catch(InputMismatchException a2)
		{
			System.out.println("exception 2");
		}
		
		catch(ArrayIndexOutOfBoundsException a3)
		   {
			   
			  System.out.println("exception 3"); 
		   }
		catch(NullPointerException a4)
		{
			System.out.println("exception 4");
		}
		catch(ClassCastException a5)
		{
			System.out.println("exception 5");
		}
		catch(IllegalArgumentException a6)
		{
			System.out.println("Exception 6");
			
		}
		finally
		{
			System.out.println("whatever happen i am with you 😁😁😁");
		}
	}
}
