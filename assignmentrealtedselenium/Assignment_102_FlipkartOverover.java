package assignmentrealtedselenium;
/*Assignment_102:"Launch flipkart.com
Hoverover on Login > Click on Sign up button
Enter your mobile number > click on continue."*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment_102_FlipkartOverover
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com");
		
		
  WebElement login=Driver.findElement(By.xpath("//a[@class='_1TOQfO']"));
  
  
  Actions a1=new Actions(Driver);
  a1.moveToElement(login).perform();
  
 
  
 WebElement signUP= Driver.findElement(By.xpath("//span[@class='_1Mikcj']"));
 signUP.click();
 
 WebElement mobileNo= Driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
 mobileNo.sendKeys("9766854466");
		
		
 WebElement continue1= Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
 continue1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
