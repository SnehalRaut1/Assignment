package assignmentrealtedselenium;
//Assignment 141:In amazon application show that logout is depending on login
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass_141 extends Launch_Quit
{
	@Test
	public void amazon_login()
	{
	
		Assert.assertTrue(false);
	
	
	}
	
	@Test(priority=1,dependsOnMethods="amazon_login")
	public void amazon_logout()
	{
		
		//Hoverover_signin
     	WebElement Account_Hoverover2=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
     	
     	Actions a2=new Actions(Driver);
     	a2.moveToElement(Account_Hoverover2).perform();
     	
        WebElement logout = Driver.findElement(By.xpath("//span[.='Sign Out']"));
        logout.click();
    	
         
       
		
	}
}
