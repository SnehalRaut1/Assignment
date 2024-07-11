package assignmentrealtedselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment117a_PArenytChildPOPUp 
{
public static void main(String[] args) {
	
	
	
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
   WebElement tf=	Driver.findElement(By.name("q"));
   tf.sendKeys("india");
   tf.sendKeys(Keys.ENTER);
	
	
    String s1=Driver.getWindowHandle();//it will give you browser id of parent browser 
	System.out.println("This is the result of GWH -> "+s1);
	
	Set<String> s2=Driver.getWindowHandles();//browser id of parent as well as child
	System.out.println("This is the result of GWHs ->"+s2);

	
	
	
	
	
}
}
