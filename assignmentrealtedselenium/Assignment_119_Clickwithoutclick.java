package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 119:How to click on a link without using click method?



public class Assignment_119_Clickwithoutclick 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement g1 = driver.findElement(By.linkText("Gmail"));
	g1.sendKeys(Keys.ENTER);

}
}
