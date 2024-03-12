package assignmentToSend;
//Assignment 45 :write a program in Array by getting the size of an array using Scanner class?
import java.util.Arrays;
import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args)
	{
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();

			int a[] = new int[size];

			for (int i = 0; i <size; i++)
			{
				a[i] = s1.nextInt();
			}

			System.out.println(Arrays.toString(a));

		}
	}
