package assignmentToSend;

import java.util.Date;

public class DateProgram
{

	
	public static void main(String[] args) {
		
		
		Date d1=new Date();
	System.out.println(	d1.getTime());
	
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	
	String a1=d2.toString();
//	System.out.println(a1);
	
	//want to find month,day,year from given date
	
	String month=a1.substring(4, 7);
	System.out.println(month);
	
	String day=a1.substring(8,10);
	System.out.println(day);
	
	String year=a1.substring(24, 28);
	System.out.println(year);
	
	System.out.println( a1.length());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
