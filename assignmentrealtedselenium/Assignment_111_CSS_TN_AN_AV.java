package assignmentrealtedselenium;
/*Assignment 111:
Launch google.com inspect search by css selector with tag name,
attribute name and attribute value 
search India 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//6.TAGNAME,ATTRIBUTE NAME AND ATTRIBUTE VALUE syntax-> TN[AN='AV']


public class Assignment_111_CSS_TN_AN_AV
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		WebElement Search=Driver.findElement(By.cssSelector("textarea[name='q']"));
		Search.sendKeys("India");
		Search.sendKeys(Keys.ENTER);

		
}
}
