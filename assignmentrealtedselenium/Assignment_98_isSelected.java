package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_98_isSelected 
{
public static void main(String[] args) 
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

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
