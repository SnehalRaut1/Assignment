package project_Second_airline;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Home_page
{

	WebDriver Driver;
	
	@FindBy(xpath = "(//div[.='Signup'])[3]")
	WebElement sign_UP;
	
	
	
	@FindBy(xpath = "//div[.='Login']")
	WebElement login;
	
	
	
	//@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
	//WebElement date;
	
	
	
	
	
	
	public void switch_childwindow() throws InterruptedException
	{
		Set<String> allwindow =Driver.getWindowHandles();
		Iterator<String> i=allwindow.iterator();
		String parentwindow= i.next();
		String childwindow= i.next();
		
		Driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	public void Hover_over_SignUP()
	{
		sign_UP.click();
	}
	
	public void Login()
	{
		login.click();
	}
	
//	public void Date_Selection()
	//{
	//	date.click();
	//}
	
	
	
	
	
	public Spicejet_Home_page(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}










	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
