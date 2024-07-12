package snehal_Maven.Selenium;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
//verify that items can be added to the shopping cart from product pages
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class TestCase_9_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void adding_product_To_cart() 
	{
		
		
		
		Amazon_Product_Search_Result_page a1=new Amazon_Product_Search_Result_page(Driver);
		a1.searching_Product_in_search_Text_Field();
		a1.Clicking_on_first_Product();
       
		Set<String> g1=Driver.getWindowHandles();
	    
	    Iterator<String> g2= g1.iterator();
	    String p1=g2.next();
	    String p2=g2.next();
	 
	    Driver.switchTo().window(p2);
		
	    a1.Adding_product_To_cart();
	    a1.Going_to_Cart_PAge();
		
		
		
		
		
		
		
	}

}
