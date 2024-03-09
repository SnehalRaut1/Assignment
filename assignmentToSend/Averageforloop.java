package assignmentToSend;
//Assignment 28 : Write a program using for loop that starts from 1 to 10 and find out its average?
public class Averageforloop {
	
	public static void main(String[] args) {
		
		double  sum=0;
		
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			
            sum+=i; 
		}
		
		System.out.println("Sum of 1 to 10 no " + sum);
		
		double average=sum/10;
		
		System.out.println("average " +  average);
	
	}
}
