package assignmentrealtedselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_98_isSelected 
{
public static void main(String[] args) throws IOException 
{

	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://grotechminds.com/is-selected/");
	
WebElement checkBox1=	Driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));

      boolean ans=checkBox1.isSelected();
      System.out.println(ans);//answer is false means checkbox is not selected
      
      if(ans==false)
      {
    	  checkBox1.click(); 
      }

    TakesScreenshot tss=Driver;//takesScrenshot is interface
    File Source=tss.getScreenshotAs(OutputType.FILE);//takesScrenshot abstart method getscreenshot as//outtype is inter face file is methos
    File distination=new File("C:\\Users\\ssneh\\eclipse-workspace\\Selenium_Project\\Screenshot\\one.png");
	FileHandler.copy(Source, distination);
	
	
	
	
	
	
	
	
	
	
	
}
}
