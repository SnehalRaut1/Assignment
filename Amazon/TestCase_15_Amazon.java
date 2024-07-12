package snehal_Maven.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_second_airline.Launch_quit;
import project_second_airline.Listener_class;
@Listeners(Listener_class.class)
//reach till cart page without login in amazon application
public class TestCase_15_Amazon extends Lunch_Quit
{

	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Reaching_cart_page()
	{
		
	    Amazon_Product_Search_Result_page a2=new Amazon_Product_Search_Result_page(Driver);
		a2.searching_Product_in_search_Text_Field_new_product();
		a2.first_new_Product_Click();
       
		Set<String> g1=Driver.getWindowHandles();
	    
	    Iterator<String> g2= g1.iterator();
	    String p1=g2.next();
	    String p2=g2.next();
	 
	    Driver.switchTo().window(p2);
		
	    a2.Adding_product_To_cart();
	    a2.Going_to_Cart_PAge();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
