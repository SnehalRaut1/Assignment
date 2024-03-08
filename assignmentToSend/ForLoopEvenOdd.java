package assignmentToSend;
//Assignment 25: Write a program to print even & odd numbers from 0 to 100
public class ForLoopEvenOdd {
	
	public static void main(String[] args) {
		
	 for(int i=0;i<=100;i++)
	{
		if(i%2==0)
		{
		System.out.println("Even NO : "+i);	
		}
		
		else
		{
			System.out.println("Odd numbers :" +i);
		}
	}

}
}