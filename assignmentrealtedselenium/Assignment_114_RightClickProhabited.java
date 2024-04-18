package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_114_RightClickProhabited 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement continueToLogin=Driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		continueToLogin.click();
		
		WebElement userName=Driver.findElement(By.name("userName"));
		userName.sendKeys("Snehal");
		
		WebElement password=Driver.findElement(By.id("label2"));
		password.sendKeys("0101");
		
		WebElement captha=Driver.findElement(By.name("loginCaptchaValue"));
		captha.sendKeys("rync6");
		
		Thread.sleep(1000);
		
		WebElement login=Driver.findElement(By.id("Button2"));
		login.click();		
		
		
		
		
		
		
		
		
	}
}
