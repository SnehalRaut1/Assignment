package assignmentrealtedselenium;
/*Assignment 80:Launch an empty browser, Navigate to “facebook.com”,Enter user name, Enter password, Click on Login button
 */

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_80_FacebookLogin
{
public static void main(String[] args)
{

	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.facebook.com");
	
	WebElement Email=Driver.findElement(By.name("email"));
	Email.sendKeys("snehal@123.com");
	
	WebElement pass=Driver.findElement(By.name("pass"));
	 pass.sendKeys("Ipl@2023");
	 
	 WebElement Login=Driver.findElement(By.name("login"));
	 Login.click();

}
}
