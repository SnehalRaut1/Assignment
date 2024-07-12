package project_Second_airline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spicejet_Login_page 
{
	
	WebDriver Driver;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement Mob_No;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement pwd;
	
	@FindBy(xpath="(//div[.='LOGIN'])[1]")
	WebElement login;
	
	public void mobile_number()
	{
		Mob_No.sendKeys("7972378649");
	}
	
	
	public void password()
	{
		pwd.sendKeys("India12345@");
	}
	
	public void Login_here()
	{
		login.click();
	}
	
	public void Invalid_mobile_number()
	{
		Mob_No.sendKeys("7972378632");
	}
	
	public void Invalid_password()
	{
		Mob_No.sendKeys("bhsgdghh");
	}
	
	
	
	
	public Spicejet_Login_page(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
