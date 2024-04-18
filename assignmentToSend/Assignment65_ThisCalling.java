package assignmentToSend;

public class Assignment65_ThisCalling 
{
	Assignment65_ThisCalling()
	{
		this(100);
		System.out.println("Const 1");
	}
	
	Assignment65_ThisCalling(int a)
	{
		
		System.out.println("Const 2");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment65_ThisCalling n1=new Assignment65_ThisCalling();
	}

}
