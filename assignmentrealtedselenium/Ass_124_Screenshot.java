package assignmentrealtedselenium;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass_124_Screenshot 
{
	public static void main(String[] args) throws IOException
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in");
		
		
		WebElement Search_tf=Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search_tf.sendKeys("shoe");
		
		WebElement Click_search=Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Click_search.click();
		
		WebElement s1=Driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		s1.click();
		
		/*TakesScreenshot tss=Driver;
	    File Source=	tss.getScreenshotAs(OutputType.FILE);
	    File Destination=new File("C:\\Users\\ssneh\\eclipse-workspace\\Selenium_Project\\Screenshot\\two.png");
	    FileHandler.copy(Source, Destination);*/
	    
		
		Set<String> g1=Driver.getWindowHandles();
	Iterator<String> g2=	g1.iterator();
	 String w1= g2.next();
	 String w2=g2.next();
	Driver.switchTo().window(w2);
		
	
	
	    
	              TakesScreenshot a1  =Driver;
	              File sor=a1.getScreenshotAs(OutputType.FILE);
	              File des=new File("C:\\Users\\ssneh\\eclipse-workspace\\Selenium_Project\\Screenshot\\three "+Math.random()+" .png");
	              FileHandler.copy(sor, des);
		
	}

}
