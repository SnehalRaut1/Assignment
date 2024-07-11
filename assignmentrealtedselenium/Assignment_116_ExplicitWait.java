package assignmentrealtedselenium;
//Assignment 116:Write a program on Explicit wait Link-> https://www.google.com/
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_116_ExplicitWait 
{


public static void main(String[] args) 
{
	ChromeDriver  Driver =new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	WebElement Search_tf1=Driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	
	WebDriverWait w1=new WebDriverWait(Driver,Duration.ofSeconds(5));
	//w1.until(ExpectedConditions.titleIs("Google"));//application is fully loaded
	//w1.until(ExpectedConditions.titleIs("Manish"));//TimeOutException
	w1.until(ExpectedConditions.titleContains("Goo"));
	//w1.until(ExpectedConditions.alertIsPresent());
//	w1.until(ExpectedConditions.);//application is fully loaded
			
	Search_tf1.sendKeys("India");
	Search_tf1.sendKeys(Keys.ENTER);
}


}
