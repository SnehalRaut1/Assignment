package snehal_Maven.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_page 
{

	WebDriver Driver;
	//finding the element using @FindBy annotations
	
		@FindBy(name="email")
		WebElement email_TF;
		
		@FindBy(id="continue")
		WebElement continue_button;
		
		@FindBy(name="password")
		WebElement password_tf;
		
		@FindBy(id="signInSubmit")
		WebElement signIn_button;
	
   //Separate method for each component to perform action
		
		public void email_Field()
		{
			email_TF.sendKeys("7972378649");
		}
		
		public void email_Field_Original()
		{
			email_TF.sendKeys("9766835533");
		}
	
	
		public void continue_button_click()
		{
			continue_button.click();
		}
	
		public void password_Field()
		{
			password_tf.sendKeys("india123");
		}
		
		public void password_Field_original()
		{
			password_tf.sendKeys("Snehal@4763");
		}
	
		public void sign_in_click()
		{
			signIn_button.click();
		}
		
		public void InCorrect_Password()
		{
			password_tf.sendKeys("ipl@123");
		}
		
		
	
 //initializing the element using pagefactory class inside the constructor	
		
		
	public Amazon_Login_page(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
