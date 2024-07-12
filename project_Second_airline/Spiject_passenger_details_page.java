package project_Second_airline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spiject_passenger_details_page 
{
	WebDriver Driver;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[3]")
	WebElement selecttitle;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement enterfirstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement enterlastname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement enterphonenumer;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement enteremailid;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	WebElement entertowncity;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpassfirstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpasslastname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpassphonenumber;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
	WebElement clicknext;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpass2firstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpass2lastname;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpass2phonenumber;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpass3firstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpass3lastname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpass3phonenumber;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement passcontinuebutton;
	
	public void select_title() 
	{
		selecttitle.click();
	}
	
	public void enter_firstname()
	{
		enterfirstname.sendKeys("snehal");
	}
	public void enter_lastname()
	{
		enterlastname.sendKeys("raut");
	}
	public void enter_phonenumber()
	{
		enterphonenumer.sendKeys("9766835533");
	}
	public void enter_emailid()
	{
		enteremailid.sendKeys("ssnehal376@gmail.com.com");
	}
	public void enter_towncity(WebDriver Driver)
	{
		entertowncity.sendKeys("mumbai");
//		Actions a1=new Actions(driver);
//		a1.sendKeys(entertowncity , "mumbai").build().perform();
    }
	public void enter_pass1_firstname()
	{
		enterpassfirstname.sendKeys("snehal");
	}
	public void enter_pass1_lastname()
	{
		enterpasslastname.sendKeys("Raut");
	}
	public void enter_pass1_phonenumber()
	{
		enterpassphonenumber.sendKeys("7972378649");
	}
	
	public void click_next_button()
	{
		clicknext.click();
	}
	
	public void enter_pass2_firstname()
	{
		enterpass2firstname.sendKeys("sandeep");
	}
	public void enter_pass2_lastname()
	{
		enterpass2lastname.sendKeys("raut");
	}
	public void enter_pass2_phonenumber()
	{
		enterpass2phonenumber.sendKeys("9766835533");
	}
	public void enter_pass3_firstname()
	{
		enterpass3firstname.sendKeys("atul");
	}
	public void enter_pass3_lastname()
	{
		enterpass3lastname.sendKeys("shinde");
	}
	public void enter_pass3_phonenumber()
	{
		enterpass3phonenumber.sendKeys("9766835533");
	}
	
	public void click_pass_continue_button()
	{
		passcontinuebutton.click();
	}
	
	public Spiject_passenger_details_page(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
}
