package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment 112:Launch google.com > inspect search by css selector with tag name,class name value ,
attribute name and attribute value > search India */

public class Assignment_112_CSS_TN_CN_AN_AV
{
public static void main(String[] args) 
{
	//7.TAGNAME,CLASSNAME,ATTRIBUTE NAME AND ATTRIBUTE VALUE syntax-> TN.CN[AN='AV']
	
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
	WebElement Search=Driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
	Search.sendKeys("india");
	Search.sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
}
}
