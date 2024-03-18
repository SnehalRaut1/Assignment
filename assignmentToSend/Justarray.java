package assignmentToSend;

import java.util.Arrays;
import java.util.Scanner;

public class Justarray {

	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		
		int a[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
