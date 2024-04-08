package assignmentrealtedselenium;
/*Assignment 106_"Launch amazon.in > locate the element with the tag name locator with value <a>
What will be the output?
A.Performs action on the first element?
B.Performs action on the all elements?
C.Performs action on the random element?
D.Throws an exception?"*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_106_Tagname_Amazon 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in");
	
	WebElement ele=Driver.findElement(By.tagName("a"));
	ele.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
