package assignmentrealtedselenium;
//Assignment 96:Handle java script popup in file:///C:/Users/DELL/OneDrive/Documents/learningHTML1.html
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_96_handlePOPUP 
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	

	
	Driver.get("file:///C:/Users/ssneh/OneDrive/Desktop/learningHTML1.html");
	Driver.switchTo().alert().accept();//yes(it is ti handle UnhandledAlertException)
	//Driver.switchTo().alert().dismiss();//no

	Driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("snehal");
	Driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("hello");
	Driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("12103");
}
}
