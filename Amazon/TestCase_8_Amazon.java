package snehal_Maven.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersClass.class)
//8: check if product can be sorted by price ,ratings,newly arrivals

public class TestCase_8_Amazon extends Lunch_Quit
{

	
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Sorting_By_NewestArivals_Price_Ratings() throws InterruptedException 
	{
		
		
		 Amazon_Product_Search_Result_page a1=new  Amazon_Product_Search_Result_page(Driver);
		 a1.searching_Product_in_search_Text_Field();
		 
		 
		 Amazon_Product_Search_Result_page a2=new Amazon_Product_Search_Result_page(Driver);
		 a2.sort_by_newly_aarival_Select();            //newly arrivals
	
		 
		 
		 
		 try {
			a1.Slider_Movement();                      //price
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 a1.Go_button_Click();
		 
		 a1. Customer_Review_Selection();
		 
	
	
		 a1.Clicking_on_first_Product();
		 
		 Set<String> g1=Driver.getWindowHandles();
		    
		    Iterator<String> g2= g1.iterator();
		    String p1=g2.next();
		    String p2=g2.next();
		 
		    Driver.switchTo().window(p2);

	
		 Assert.assertEquals( "Buy Puma Mens Retaliate Tongue Black-White Running Shoe - 8 UK (37614901) at Amazon.in",Driver.getTitle());	
	
	
	
	
	
	}
}
