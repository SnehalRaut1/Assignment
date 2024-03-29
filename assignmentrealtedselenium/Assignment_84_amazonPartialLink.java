package assignmentrealtedselenium;
/*Assignment 84:"Launch amazon India
 * 
Click on Customer Services link using partialLinkText locator"*/

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_84_amazonPartialLink
{
public static void main(String[] args) 
{
	ChromeDriver  Driver =new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in");
	Driver.findElement(By.partialLinkText("Customer")).click();//you can either customer or service
}
}
