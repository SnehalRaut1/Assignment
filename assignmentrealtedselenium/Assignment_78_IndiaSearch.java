package assignmentrealtedselenium;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
/* Assignment 78 :Launch an empty browser, 
* Navigate to “google.com”, 
 * Type India in search text field,
   Click on search button*/
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_78_IndiaSearch
{
public static void main(String[] args)
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
    //Driver.findElement(By.name("q")).sendKeys("india");
	
	WebElement Search=Driver.findElement(By.name("q"));
	Search.sendKeys("india");
	
	WebElement submit=Driver.findElement(By.name("btnK"));
	submit.click();
}
}
