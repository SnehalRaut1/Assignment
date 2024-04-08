package assignmentrealtedselenium;
/*Assignment 103:"Launch grotechminds.com/ drag-and-drop/
Perform drag and drop action"*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_103_DragDrop
{
public static void main(String[] args)
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://grotechminds.com/drag-and-drop/");
	
	WebElement postman= Driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
	WebElement drop= Driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));
	 
	Actions a1=new Actions(Driver);
	a1.dragAndDrop(postman, drop).perform();
	//a1.doubleClick(drop).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
