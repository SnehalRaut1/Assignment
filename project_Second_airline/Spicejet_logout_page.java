package project_Second_airline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spicejet_logout_page 
{   
	WebDriver Driver;
	
	@FindBy(xpath="(//*[local-name()='svg' and @data-testid='svg-img' ]/*[local-name()='g']/*[local-name()='path'])[3]")
	WebElement svg_img;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[1]")
	WebElement svg_img_search_logout;
	
	
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj'])[1]")
	WebElement logout;
	
	public void click_svg_img(ChromeDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions a1=new Actions(driver);
		a1.click(svg_img).build().perform();
		//Thread.sleep(4000);
		//svg_img.click();
	}
	public void click_svg_img_search_logout(WebDriver Driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions a1=new Actions(Driver);
		a1.click(svg_img_search_logout).build().perform();
		//Thread.sleep(4000);
		//svg_img.click();
	}
	
	
	public void click_logout(WebDriver Driver)
	{
		Actions a2=new Actions(Driver);
		a2.click(logout).build().perform();
		//logout.click();
	}
	
   public Spicejet_logout_page(WebDriver Driver)
   { 
	PageFactory.initElements(Driver, this);
   }

}
