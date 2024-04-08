package assignmentrealtedselenium;
/*Assignment_107:Launch google.com > inspect search by css selector with class name> search India*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_107_CSS_ClassNameVlue 
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		WebElement ele=Driver.findElement(By.cssSelector(".gLFyf"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);
}
}
