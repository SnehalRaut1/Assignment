package assignmentToSend;
//Assignment 44:Create an array of length 3 of int data type and add its value at the runtime
import java.util.Arrays;
import java.util.Scanner;

public class Assignment44 
{
public static void main(String[] args) {
	
	int age[]=new int[3];
	
	Scanner s1=new Scanner(System.in);
	
	for(int i=0;i<=2;i++)
	{
		age[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(age));
	
}
}
