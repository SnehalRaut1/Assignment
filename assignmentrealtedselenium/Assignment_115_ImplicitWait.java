package assignmentrealtedselenium;
//Assignment 115:
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_115_ImplicitWait 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in");
	
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Search=Driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	Search.sendKeys("shoes");
	Search.sendKeys(Keys.ENTER);
	
	
}
}
