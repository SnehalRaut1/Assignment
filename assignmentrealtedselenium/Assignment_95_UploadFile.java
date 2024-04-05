package assignmentrealtedselenium;
//Assignment 95:Launch GroTechMinds.com > register page > upload the file.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_95_UploadFile 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		

		//file
		WebElement file1=driver.findElement(By.name("file"));
		file1.sendKeys("C:\\Users\\ssneh\\eclipse-workspace\\Selenium_Project\\src\\launch\\selenium\\Demo2.java");
}
}