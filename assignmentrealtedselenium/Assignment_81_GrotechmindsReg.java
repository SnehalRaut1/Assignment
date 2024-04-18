package assignmentrealtedselenium;
//Assignment 81:Launch an empty browser, Navigate to “grotechminds.com”

//registration page, Enter email, password, 
//present address, permanent address and pin code.
 
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_81_GrotechmindsReg
{
public static void main(String[] args) 
{
	ChromeDriver Driver= new ChromeDriver(); 
	Driver.get("https://grotechminds.com/registration/");
	
	Driver.manage().window().maximize();
	
	WebElement Email1=Driver.findElement(By.id("email"));
	Email1.sendKeys("1111000");
	
	WebElement a=Driver.findElement(By.id("Present-Address"));
	a.sendKeys("Banglore,marthalli");
	
	WebElement a2=Driver.findElement(By.name("Permanent-Address"));
	a2.sendKeys("satara,maharashtra");

	WebElement pin=Driver.findElement(By.id("Pincode"));
	pin.sendKeys("515002");
	
	WebElement done=Driver.findElement(By.name("Submit"));
    done.click();
}
}
