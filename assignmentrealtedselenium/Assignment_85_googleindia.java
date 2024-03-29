package assignmentrealtedselenium;
/*Assignment 85:"Launch google.com
Type India using relative xpath"*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_85_googleindia
{
public static void main(String[] args) 
{
	ChromeDriver  Driver =new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
	/*WebElement Search_tf=Driver.findElement(By.xpath("(//textarea)[1]"));
	Search_tf.sendKeys("india");*/
	
	WebElement Search_tf1=Driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	Search_tf1.sendKeys("india");
	
	WebElement clik=Driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	clik.click();
	
	
	
}
}
