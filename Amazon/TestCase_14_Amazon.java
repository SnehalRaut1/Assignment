package snehal_Maven.Selenium;
//go to order page and click on your last ordered product and give 5 star ratings

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_second_airline.Launch_quit;
import project_second_airline.Listener_class;
@Listeners(Listener_class.class)
public class TestCase_14_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Order_Page_rating_five_star() throws InterruptedException
	{
		
		
		
		Amazon_Home_page a1=new Amazon_Home_page(Driver);
		a1.Hover_over_Account_And_List_component_OF_Amazon_Home_Page(Driver);
		a1.Sign_In_Amazon();
		
       Amazon_Login_page L1=new Amazon_Login_page(Driver);
  		
  		L1.email_Field_Original();
  		L1.continue_button_click();
  		L1.password_Field_original();
  		L1.sign_in_click();
  		
  		
  		Amazon_Home_page a2=new Amazon_Home_page(Driver);
  		a2.Hover_over_Account_And_List_component_OF_Amazon_Home_Page(Driver);
  		a2.Your_Ordes_Clicking();
  		
  		Amazon_Product_Search_Result_page a3=new Amazon_Product_Search_Result_page(Driver);
  		a3.product_review_clīck_Movement();
  		a3.ratings_Four_star();

	
	
	
	
	
	}
}