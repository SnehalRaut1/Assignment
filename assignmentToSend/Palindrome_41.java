package assignmentToSend;
//Assignment 41:write a program to check whether the given string is palindrome or not
public class Palindrome_41
{
	public static void main(String[] args) 
	{
	String name="radar";
	String reverse = "" ;
	
	for(int i=name.length()-1;i>=0;i--)
	{
		char answer=name.charAt(i);
		
		reverse=reverse+answer;
		//System.out.println(reverse);//how each iteration perform it will give
	}
	
	System.out.print(reverse);
	
	boolean b= name.equals(reverse);
	
	System.out.println(b);
	
	if(b==true)
	{
		System.out.println("palindrom");
	}
	
	else
	{
		System.out.println("not palindrome");
	}
}
}

