package assignmentToSend;
//Assignment 39:write a program for multiple level inheritance with 4 parents  using interface?
   interface one
    {
	   void add();
		void substarct();
		
    }
   interface two
   {
	   void multiply();
		void division();
    }
   interface three
    {
	   void circle();
		void triangle();
    }
   interface four
   {
	   void square();
		void rectangle();
   }

public class Inter39 implements one,two ,three,four
{
	

	
	public void square() {
		System.out.println("1");
		
	}


	public void rectangle() 
	{
		System.out.println("2");
		
	}

	
	public void circle()
	{
		System.out.println("3");
	}


	public void triangle()
	{
		System.out.println("4");
	}

	
	public void multiply() 
	{
		System.out.println("5");
	}

	
	public void division() 
	{
		System.out.println("6");	
	}

	
	public void add() 
	{
		System.out.println("7");
	}

	
	public void substarct() 
	{
		System.out.println("8");
	}
	
public static void main(String[] args)

{
	Inter39 i1=new Inter39();
	i1.add();
	i1.circle();
	i1.division();
	i1.substarct();
	i1.square();
	i1.rectangle();
	i1.multiply();
	i1.triangle();
	}
	
}

