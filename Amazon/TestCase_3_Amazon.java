package snehal_Maven.Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class TestCase_3_Amazon extends Lunch_Quit
{
      @Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
      public void Login_Fail_With_Incorrect_Credentials_Like_Password()
      {
    	  ChromeDriver Driver =new ChromeDriver();
  		Driver.manage().window().maximize();
  		Driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
  		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		
  		
  		Amazon_Login_page L1=new Amazon_Login_page(Driver);
  		
  		L1.email_Field();
  		L1.continue_button_click();
  		L1.InCorrect_Password();
  		L1.sign_in_click();
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
