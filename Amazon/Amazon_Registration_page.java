package snehal_Maven.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration_page 
{

	WebDriver Driver;
	
	//step 1
	
	@FindBy(id="ap_customer_name")
	WebElement Your_Name;
	
	@FindBy(id="ap_phone_number")
	WebElement Mob_Number;
	
	@FindBy(id="ap_password")
	WebElement password_Reg;
	
	@FindBy(id="continue")
	WebElement Verify_Mobile_number;
	
	
	
	
	
	
	
	
	
	//step 2
	
	public void First_And_Last_Name_Of_Registarion_Page()
	{
		Your_Name.sendKeys("ketan pawar");
	}
	
	
	public void Mobile_Number_Of_Registarion_Page()
	{
		Mob_Number.sendKeys("9850332394");
	}
	
	public void password_Of_Registarion_Page()
	{
		password_Reg.sendKeys("123@456a");
	}
	
	public void Verify_Button_Of_Registarion_Page()
	{
		Verify_Mobile_number.click();
	}
	
	
	
	
	//step 3
	
	public Amazon_Registration_page(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	
}
