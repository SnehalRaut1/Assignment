package project_second_airline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testt_10 
{

   @Test
   public void a() throws InterruptedException
   {
	   
	   ChromeDriver Driver=new ChromeDriver();
	   Driver.get("https://www.spicejet.com/");
	   
	   Thread.sleep(5000);
	   
	   WebElement dparture_Date=Driver.findElement(By.xpath("//div[.='Departure Date']"));
	   dparture_Date.click();
	   Thread.sleep(5000);
	   
	   WebElement dparture_Date_Selection=Driver.findElement(By.xpath("(//div[.='31'])[1]"));
	   dparture_Date_Selection.click();
	   
	   
	   //WebElement passenger=Driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]"));
	  WebElement passenger=Driver.findElement(By.xpath("//div[.='1 Adult']"));

	 Thread.sleep(5000);
	   passenger.click();
	  
	  // WebElement Select_Adult=Driver.findElement(By.xpath("//div[.='1 Adult']"));
	   WebElement Add_Adult_plus=Driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]"));

	   
	   for(int i=1;i<=1;i++)
	   {
		   Add_Adult_plus.click();
	   }
	   
	   WebElement currency=Driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[3]"));
	   currency.click();
	   Thread.sleep(5000);
	   
			   WebElement INR=Driver.findElement(By.xpath("(//div[.='INR'])[3]"));
			   INR.click();
	   
	   
   }
	
}
