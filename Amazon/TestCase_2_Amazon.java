package snehal_Maven.Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class TestCase_2_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Verify_Login_To_Amazon_With_Correct_Credentials()
	{
		
		
		
		Amazon_Login_page L1=new Amazon_Login_page(Driver);
		
		L1.email_Field();
		L1.continue_button_click();
		L1.password_Field();
		L1.sign_in_click();

		
		
		
		
		
		
		
		
		
		
		
	}

}
