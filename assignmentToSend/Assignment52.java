package assignmentToSend;
//Assignment 52:
import java.util.Scanner;

public class Assignment52
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();// value 5 i am providing
	
	int fact=1;
	for(int i = a;i>=1;i--)
	{
		fact=fact*i;
		//System.out.println(fact);
	}
	System.out.println(fact);
}
}
