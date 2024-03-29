package assignmentrealtedselenium;
//Assignment 82:Launch google.com Click on Gmail link using LinkText locator 



import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_82_GmailLinkText
{
public static void main(String[] args) 
{
	ChromeDriver  Driver =new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
	Driver.findElement(By.linkText("Gmail")).click();
}
}
