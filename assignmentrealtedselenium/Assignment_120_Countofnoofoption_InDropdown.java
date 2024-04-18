package assignmentrealtedselenium;
//Assignment 120:Count the number of options in a dropdown


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_120_Countofnoofoption_InDropdown
{
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement dd = driver.findElement(By.id("searchDropdownBox"));
	
	Select s1=new Select(dd);
	
	List<WebElement> ls=s1.getOptions();
    int count=ls.size();
    System.out.println(count);
}
}
