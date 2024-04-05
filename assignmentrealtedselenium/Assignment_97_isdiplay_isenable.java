package assignmentrealtedselenium;
//Assignment 97_Launch google.com > type India by making sure that the component is displaying and enabled.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_97_isdiplay_isenable
{
public static void main(String[] args) 
{
	ChromeDriver  Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	
	WebElement serch_tf=Driver.findElement(By.id("APjFqb"));
	
	
	if(serch_tf.isDisplayed()==true && serch_tf.isEnabled()==true)
	{
		serch_tf.sendKeys("india");
	}
	
	
	
}
}
