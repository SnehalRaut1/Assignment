package assignmentToSend;
//Assignment 27: create 5 methods for addition , subtraction , multiplication ,divison , modulus using scanner class 
//with global variable
import java.util.Scanner;

public class ScannerOpearations {
	
	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		int a= s1.nextInt();                 //Addition
		int b=    s1.nextInt();
		int sum= a+b;
		System.out.println(sum);            
		
		int c=s1.nextInt();                   //Substraction
		int d=s1.nextInt();
		int sub= c-d;
		System.out.println(sub);
		
		int p=s1.nextInt();                   //multiplication
		int q=s1.nextInt();
		int mul= p*q;
		System.out.println(mul);
		
		int j=s1.nextInt();                   //devision
		int k=s1.nextInt();
		int div= j/k;
		System.out.println(div);
		
		int m=s1.nextInt();                   //modulus
		int n=s1.nextInt();
		int module= m%n;
		System.out.println(module);
		
	}

}
