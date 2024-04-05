package assignmentrealtedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_99_FlipkartAutosuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	 ChromeDriver Driver=new ChromeDriver();
	   Driver.manage().window().maximize();
	   Driver.get("https://www.flipkart.com/");
	   
	   WebElement Search_TF=Driver.findElement(By.name("q"));
       Search_TF.sendKeys("mobile");
       Thread.sleep(1000);//it is necessary to give thread sleep
       
       List<WebElement> auto=Driver.findElements(By.xpath("//div[@class='_1sFryS _2alaMB']/ul/li"));
 	  int count=auto.size();
 	  System.out.println(count);
 	  Thread.sleep(2000);
 	  auto.get(1).click();//

























}
}
