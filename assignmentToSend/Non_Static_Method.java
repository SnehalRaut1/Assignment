package assignmentToSend;
//Assignment 15:How to call non-static method inside a main method

public class Non_Static_Method {
	
	void add()
	{
		System.out.println("1");
	}
	
	
	public static void main(String[] args) {
		
		Non_Static_Method N1= new Non_Static_Method();
		N1.add();
		
		
	}

}
