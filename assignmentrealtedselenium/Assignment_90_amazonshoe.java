package assignmentrealtedselenium;

import org.openqa.selenium.By;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_90_amazonshoe 
{

	public static void main(String[] args) 
	{
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in");
		
		
		WebElement Search_tf=Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search_tf.sendKeys("shoe");
		
		WebElement Click_search=Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Click_search.click();
		
		WebElement s1=Driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[25]"));
		s1.click();
}
}