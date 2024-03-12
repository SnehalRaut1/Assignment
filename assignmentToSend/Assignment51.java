package assignmentToSend;
//Assignment51 : check if the given string contains space
public class Assignment51 {
	public static void main(String[] args) {
		
		
		String name="Snehal Raut";
		char a[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		 boolean answer=	Character.isSpaceChar(a[i]);
	//	System.out.println(answer);
		
		if(answer==true)
				{
			System.out.println("index position " + i + " space is present");
				}
		
		
		
		
		
		}
		
	}

}
