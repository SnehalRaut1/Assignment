package assignmentrealtedselenium;
/*Asignment 109:Launch google.com > inspect search by css selector with tag name . class name value > search India*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_109_CSS_TagnameDotClassValue 
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		WebElement ele=Driver.findElement(By.cssSelector("textarea.gLFyf"));
		ele.sendKeys("pune");
		ele.sendKeys(Keys.ENTER);
}

}
