package assignmentrealtedselenium;
//Assihnment 83:"Launch amazon India Click on Mobiles link using LinkText locator



import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment_83_AmazonMobLinkText
{
public static void main(String[] args)
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.amazon.in/");
	Driver.manage().window().maximize();
	
	WebElement mob=Driver.findElement(By.linkText("Mobiles"));
	mob.click();
	
}
}
