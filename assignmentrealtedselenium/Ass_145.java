package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*Assignment 145:"Listeners timeout invoking


and 
listeners skipped invoking"*/
public class Ass_145 
{
	WebDriver Driver;
	@Test(timeOut=1000)
	public void testcase1()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		
		//Hoverover_signin
		WebElement Account_Hoverover=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		Actions a1=new Actions(Driver);
		a1.moveToElement(Account_Hoverover).perform();
		
		WebElement Sign_in=Driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		Sign_in.click();
//		Sign_in.sendKeys(Keys.ENTER);
		
		//login code
	     WebElement email= Driver.findElement(By.name("email"));
	     email.sendKeys("7972378649");
	     
	     WebElement continue1 = Driver.findElement(By.id("continue"));
	     continue1.click();
	     
	     WebElement password= Driver.findElement(By.name("password"));
	     password.sendKeys("india123");
	     
	     WebElement signIN = Driver.findElement(By.id("signInSubmit"));
	     signIN.click();
	     
	 	}
	
	@Test(dependsOnMethods="testcase1")
	public void testcase2()
	{
		//Hoverover_signin
     	WebElement Account_Hoverover2=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
     	
     	Actions a2=new Actions(Driver);
     	a2.moveToElement(Account_Hoverover2).perform();
     	
        WebElement logout = Driver.findElement(By.xpath("//span[.='Sign Out']"));
        logout.click();
    	
	}

}
