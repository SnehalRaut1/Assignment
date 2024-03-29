package assignmentrealtedselenium;
//Assignment 91:Launch amazon.in > select books from drop-down, search world and enter, 
//select the first book.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_91_Amazon_dropdown
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	
   WebElement dd=driver.findElement(By.xpath("//select[@name='url']"));
   
   Select s1=new Select(dd);
   
//   s1.selectByIndex(10);//when there is 10 so it will select component 11th bcoz of index 
  // s1.selectByIndex(5);  //6th it allow int
   s1.selectByVisibleText("Books");//it allow string parameter
  // s1.selectByValue("search-alias=digital-music");//it allow string parameter
   
	
    /* WebElement search_TF=driver.findElement(By.xpath("//input[@name='field-keywords']"));
     search_TF.sendKeys("World");*/
     
     WebElement search_TF1=driver.findElement(By.id("twotabsearchtextbox"));
     search_TF1.sendKeys("World");	
     search_TF1.sendKeys(Keys.ENTER);
     
     	

    
  WebElement first_world=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
    first_world.click();//done*/
     

	
	
}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

