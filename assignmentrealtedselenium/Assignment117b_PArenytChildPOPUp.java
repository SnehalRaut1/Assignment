package assignmentrealtedselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment117b_PArenytChildPOPUp 
{
	public static void main(String[] args)
	{
		
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		
		WebElement google_link=Driver.findElement(By.xpath("//span[.='Google']"));
		google_link.click();
		
	    Set<String>	g1=Driver.getWindowHandles();
	    System.out.println(g1);
	    
	    //Driver.close();it close parent wondow bcoz it has control yrt we not pass control to anoter window
	    
	    Iterator<String> g2=g1.iterator();
	  String s1=  g2.next();//abstarct method next give ->1St time parent id
	   String s2= g2.next();//abstarct method next give ->1St time parent id
	   
	   Driver.switchTo().window(s2);//move to that window
	    
	   Driver.close();//it will close child window

	   
	   
	   



















	//[6E902FF5865E600BCAB408C268CBBC1D, E6CE543DD34F1B24476585A1FEA95938]
		//parent browser id,              child browser id
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
