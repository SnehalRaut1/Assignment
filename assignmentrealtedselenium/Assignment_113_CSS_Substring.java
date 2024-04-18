package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113_CSS_Substring 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in");
	
	WebElement Search=Driver.findElement(By.cssSelector("input[class^='nav-input nav']"));
	Search.sendKeys("shoes");
	Search.sendKeys(Keys.ENTER);
}
}
