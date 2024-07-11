package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{
	WebDriver Driver;
	@BeforeMethod
	public void precondition()
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
	
	@AfterMethod
	public void postcondition()
	{
		
        
        Driver.quit();
       
		
	}
}
