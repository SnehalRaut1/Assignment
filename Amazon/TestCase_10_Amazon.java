package snehal_Maven.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
//Test updating item quantities and removing items from cart
public class TestCase_10_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Updating_And_Removing_Product_From_cart()
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
	    
	    Amazon_Product_Search_Result_page a3=new Amazon_Product_Search_Result_page(Driver);
	    a3.searching_Product_in_search_Text_Field_new_product2();
	    a3.first_new_Product_Bottle_click();
       
		Set<String> x1=Driver.getWindowHandles();
	    
	    Iterator<String> x2= x1.iterator();
	    String y1=x2.next();
	    String y2=x2.next();
	    String y3=x2.next();
	 
	    Driver.switchTo().window(y3);
		
	    a3.Adding_product_To_cart();
	    a3.go_to_cart_click();
	    
	    a3.removing_product_from_cart();
	    a3.removing_product_from_cart1();
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
