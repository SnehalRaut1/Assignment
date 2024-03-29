package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_89_flipcartMobile 
{
	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		
		
		WebElement Click_search=Driver.findElement(By.xpath("//span[.='Mobiles']"));
		Click_search.click();
		
		WebElement c1=Driver.findElement(By.xpath("//button[.='✕']"));//span[.='X']
		c1.click();
	}

}
