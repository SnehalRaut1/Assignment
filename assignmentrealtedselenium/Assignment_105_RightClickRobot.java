package assignmentrealtedselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_105_RightClickRobot 
{
public static void main(String[] args) throws AWTException, InterruptedException 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
	WebElement email=Driver.findElement(By.linkText("Gmail"));
	
	Actions a1=new Actions(Driver);
	a1.contextClick(email).perform();
	
	Robot r1=new Robot();
	
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r1.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
