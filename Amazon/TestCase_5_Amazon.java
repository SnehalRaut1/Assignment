package snehal_Maven.Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Test Searching For products using its name like shoe
@Listeners(ListenersClass.class)
public class TestCase_5_Amazon extends Lunch_Quit
{

	  @Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	  public void Searching_Product()
	  {

            
			
			Amazon_Product_Search_Result_page a1=new Amazon_Product_Search_Result_page(Driver);
			a1.searching_Product_in_search_Text_Field();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	  }
}
