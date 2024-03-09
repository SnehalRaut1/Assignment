package assignmentToSend;

//Assignment 7 : Create a class,create a main method,create 5 static method each for addition, 
//sub,mul,div,module and call? 


public class Arithmatic_Operations {
	
	static void Addition()
	{
		int a=100 ;// delcaration and initialization of variable
		int b=200;
		int sum=a+b;
		System.out.println(sum);
		
		
		
	}
	
	static void Substraction()
	{
		int X=200;
		int Y=400;
		int Z=Y-X;
		System.out.println(Z);
			
	}
	
	static void Multiplication()
	{
		int M=20;
		int N=20;
		int O=M*N;
		System.out.println(O);
		
	}
	
	static void quotient() 
	{
	int p=4;
	int q=2;
	int r=p/q;
	System.out.println(r);
	}
	
	
	static void module()
	{
	int a=4;
	int b=2;
	int c=a%b;
	System.out.println(c);
	
	
	}
	
	
	public static void main(String[] args) {
		
		Addition();
		Substraction();
		Multiplication();	
		quotient();
		module();
	}
	

}














