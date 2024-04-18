package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment 110:Launch google.com 
 * > inspect search by css selector with attribute name and attribute value 
 * > search India
 */

//5.ATTRIBUTE NAME AND ATTRIBUTE VALUE syntax-> [AN='AV']
public class Assignment_110_CSS_AN_AV 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
	WebElement Search=Driver.findElement(By.cssSelector("[id='APjFqb']"));
	Search.sendKeys("India");
	Search.sendKeys(Keys.ENTER);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
