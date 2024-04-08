package assignmentrealtedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;//from which package we get action class

public class Assignment_101_HoverOver
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in");
	
	

	WebElement account_click=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	
	Actions A1=new Actions(Driver); 
	A1.moveToElement(account_click).perform();//till here from findele code is for hoverover
	
	
	WebElement signIn=Driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
	signIn.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}






