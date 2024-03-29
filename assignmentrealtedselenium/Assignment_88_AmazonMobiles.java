package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_88_AmazonMobiles
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in");
		
		
		WebElement Click_search=Driver.findElement(By.xpath("//a[.='Mobiles']"));
		Click_search.click();
		
		
		
		
		
		
		
		
		
	}

}
