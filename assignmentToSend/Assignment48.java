package assignmentToSend;
//Assignment 48:In a string "mango" calculate how many are alpha and how many are numeric
public class Assignment48 
{
	public static void main(String[] args) 
	{
		String name="mango";
		char a[]=name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;

		
		for (int i=0;i<name.length();i++)
		{
     	boolean answer=	Character.isAlphabetic(a[i]);
		
     //	System.out.println(answer);
    if(answer==true)
    {
    	count_of_alpha++;
    }
    else
    {
    	count_of_numeric++;
    	
    }
		}

    System.out.println(count_of_alpha);
    System.out.println(count_of_numeric);
	
	}}