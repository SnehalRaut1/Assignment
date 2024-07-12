package snehal_Maven.Selenium;
//Ensure that the product details page displays all necessary information.price review description

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)

public class Testcase_7_Amazon extends Lunch_Quit
{
	
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Searching_with_filters_Category_Price()
	{
		
		
		
		 Amazon_Product_Search_Result_page a1=new  Amazon_Product_Search_Result_page(Driver);
		 a1.searching_Product_in_search_Text_Field();
		 
		 a1.category_Womens_Running_shoes();
		 
		 try {
			a1.Slider_Movement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 a1.Go_button_Click();
		 
		 a1.Clicking_on_first_Product();
		 
		 Set<String> g1=Driver.getWindowHandles();
		    
		    Iterator<String> g2= g1.iterator();
		    String p1=g2.next();
		    String p2=g2.next();
		 
		    Driver.switchTo().window(p2);
		    
		    a1.price_Of_Product_datils_page_Click();
		    a1.product_Review_clīck_Movement();
		    a1.Product_details_clīck_Movement();
		 
		 
	}
}