package assignmentToSend;


//Assignment 27: create 5 methods for addition , subtraction , multiplication ,divison , 
//modulus using scanner class with global variable


import java.util.Scanner;

public class Assignment_27 {
	
	static int no1;
	static int no2;
	
	static void add()
	{
		int sum=no1+no2;
		System.out.println(sum);
	}
	static void sub()
	{
		int sub=no1-no2;
		System.out.println(sub);
	}
	static void mul()
	{
		int mul=no1*no2;
		System.out.println(mul);
	}
	static void div()
	{
		int div=no1/no2;
		System.out.println(div);
	}
	static void mod()
	{
		int mod=no1%no2;
		System.out.println(mod);
	}
	
	
	public static void main(String[] args) {
		
		Scanner S1=new Scanner(System.in);
		   no1=        S1.nextInt();
		   no2=        S1.nextInt();
		   add();
		   sub();
		   mul();
		   div();
		   mod();
	}

}

