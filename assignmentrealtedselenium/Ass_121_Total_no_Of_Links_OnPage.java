package assignmentrealtedselenium;
//Assignment 121:Calculate the total number of links in any web page.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_121_Total_no_Of_Links_OnPage 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
    List<WebElement> list=driver.findElements(By.tagName("a"));
    
    int countOFlinks=list.size();
    System.out.println(countOFlinks);
    
    
}
}
