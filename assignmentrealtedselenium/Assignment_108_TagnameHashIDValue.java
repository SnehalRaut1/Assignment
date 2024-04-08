package assignmentrealtedselenium;
/*Assignment 108:Launch google.com > inspect search by css selector with tag name and id > search India*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_108_TagnameHashIDValue 
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		WebElement ele=Driver.findElement(By.cssSelector("textarea#APjFqb"));
		ele.sendKeys("india");
		ele.sendKeys(Keys.ENTER);
}
}
