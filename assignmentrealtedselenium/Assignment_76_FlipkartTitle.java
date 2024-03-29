package assignmentrealtedselenium;
//Assignment 76:Launch a chrome browser and get the title of the Flipkart page
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_76_FlipkartTitle
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.flipkart.com");
   String title=Driver.getTitle();
   System.out.println(title);
}
}

