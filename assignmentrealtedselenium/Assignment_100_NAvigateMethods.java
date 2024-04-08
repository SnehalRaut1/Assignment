package assignmentrealtedselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_100_NAvigateMethods 
{
public static void main(String[] args) throws InterruptedException 
{

	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	//Driver.get("https://www.google.com");
	Driver.navigate().to("https://www.google.com");
	
	Thread.sleep(2000);
	Driver.navigate().back();//it will go back empty browser
	
	Thread.sleep(2000);
    Driver.navigate().forward();

    Thread.sleep(2000);
    Driver.navigate().refresh();





















}
}
