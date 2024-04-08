package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_104_DoubleClick 
{
	public static void main(String[] args)
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://grotechminds.com/");
		
		WebElement Course=Driver.findElement(By.xpath("(//a[@class='elementor-item'])[3]"));
		
		Actions a1=new Actions(Driver);
		a1.doubleClick(Course).perform();
}
}