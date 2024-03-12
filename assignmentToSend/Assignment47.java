package assignmentToSend;
//Assignment 47: In  a string "mango123" check which character is numeric and which is alpha
public class Assignment47 
{
	public static void main(String[] args)
	{
		String name="mango123";
		char a[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isAlphabetic(a[i]);
			//System.out.println(answer);
			if(answer==true)
			{
				System.out.println("index position "+ i + " is alpha"  );
			}
			else
			{
				System.out.println("index position "+ i + " is numeric"  );
			}
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
