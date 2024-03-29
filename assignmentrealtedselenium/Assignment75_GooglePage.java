package assignmentrealtedselenium;

import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 75:Launch a chrome browser and open google page

public class Assignment75_GooglePage
{
public static void main(String[] args)
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com");
}
}
