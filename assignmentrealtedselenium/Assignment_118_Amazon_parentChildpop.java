package assignmentrealtedselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignmnet 118:Launch amazon.in  
> type shoes in search
> select first shoe 
> click on add to cart.click on proceed to buy*/

public class Assignment_118_Amazon_parentChildpop 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in/");
	
	WebElement Search=Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Search.sendKeys("Shoe");
	Search.sendKeys(Keys.ENTER);
	

	WebElement first_shoe=Driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	first_shoe.click();
	
	Set<String> g1=Driver.getWindowHandles();
	System.out.println(g1);
	Iterator<String> g2=g1.iterator();
    String s1=	g2.next();
    String s2=	g2.next();
    
    Driver.switchTo().window(s2);
	
    WebElement add_to_cart=Driver.findElement(By.cssSelector("#add-to-cart-button"));
    add_to_cart.sendKeys(Keys.ENTER);
	
	
	  WebElement proceed_to_Buy=Driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	  proceed_to_Buy.click();
	  
	 // Driver.close();
	//Driver.quit();
	
	
	
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
      
	
	
	
	
}
}
