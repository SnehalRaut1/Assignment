package assignmentToSend;

import java.util.Arrays;

//Assignment 50: Copy the value of 1 array into another array using iteration
public class Assignment50 {
	
	public static void main(String[] args) {
		
		
		int age[]=new int[3];
          age[0]=10;
		  age[1]=35;
		  age[2]=5;
		  
			int age1[]=new int[age.length];
			
			for(int i=0;i<3;i++)
			{
				age1[i]=age[i];
			}

		  System.out.println(Arrays.toString(age));
		  System.out.println(Arrays.toString(age1));
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
