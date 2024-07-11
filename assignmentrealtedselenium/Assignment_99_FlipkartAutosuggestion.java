package assignmentrealtedselenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_99_FlipkartAutosuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	 WebDriver Driver=new ChromeDriver();
	   Driver.manage().window().maximize();
	   Driver.get("https://www.google.com/");
	  
	   
	   WebElement Search_TF=Driver.findElement(By.name("q"));
       Search_TF.sendKeys("mobile");
       Thread.sleep(1000);//it is necessary to give thread sleep
       
       List<WebElement> auto=Driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
 	  int count=auto.size();
 	  System.out.println(count);
 	  Thread.sleep(2000);
 	  auto.get(1).click();//

























}
}
