package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_87_facebook 
{
public static void main(String[] args) 
{
	
	
	ChromeDriver  Driver =new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get("https://www.facebook.com");
	
	WebElement e1=Driver.findElement(By.xpath("//input[@name='email']"));
	e1.sendKeys("snehal@gmail.com");
	
	WebElement pass=Driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("1212");
	
	WebElement login=Driver.findElement(By.xpath("//input[@name='login']"));
	login.click();
	
	
	
	
	
	
}
}
