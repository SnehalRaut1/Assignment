package snehal_Maven.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Validate entire checkout process,including address selection ,payment method selection,and order review 
@Listeners(ListenersClass.class)
public class TestCase_11_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Entire_Checkout_process_Till_Order_Review() throws InterruptedException
	{
		
		
		
		Amazon_Home_page a1=new Amazon_Home_page(Driver);
		a1.Hover_over_Account_And_List_component_OF_Amazon_Home_Page(Driver);
		a1.Sign_In_Amazon();
		
       Amazon_Login_page L1=new Amazon_Login_page(Driver);
  		
  		L1.email_Field();
  		L1.continue_button_click();
  		L1.password_Field();
  		L1.sign_in_click();
  		
  		
  		Amazon_Home_page a2=new Amazon_Home_page(Driver);
  		a2.Hover_over_Account_And_List_component_OF_Amazon_Home_Page(Driver);
  		a2.Your_Account_Clicking();
  		a2.Your_Address_Clicking();
		a2.Add_Address_Clicking();
		a2.Fillinng_Address_Country_Region();
		a2.Full_name_Field() ;
		a2.Mobile_Number_Field();
		a2.Flat_House_Field();
		a2.Area_Street_Field();
		a2.landmark_Field();
		a2.Town_City_Field();
		a2.state_Field();
		
		
		a2.AddAddress_button_Field();
		
		
		Amazon_Product_Search_Result_page a3=new Amazon_Product_Search_Result_page(Driver);
		a3.searching_Product_in_search_Text_Field();
		
		a3.Clicking_on_first_Product();
		
		Set<String> g1=Driver.getWindowHandles();
	    
	    Iterator<String> g2= g1.iterator();
	    String p1=g2.next();
	    String p2=g2.next();
	 
	    Driver.switchTo().window(p2);
	    
	    a3.Adding_product_To_cart();
	    a3.Going_to_Cart_PAge();
	    a3.proceedToRetailCheckout_Click();
	    
	    Amazon_Address_page a4=new Amazon_Address_page(Driver);
	    a4.selecting_Address_Out_Of_All_Addresses();
	    a4.Use_This_Address_Click_Here();
	  
		
	    Amazon_Payment_Page a5=new Amazon_Payment_Page(Driver);
	    a5.Select_payment_method_Credit_Card();
	    
	   Thread.sleep(10000);
	    a5.Enter_Card_Detalis_Click_Here();
	    
	    Driver.switchTo().frame(Driver.findElement(By.xpath("(//iframe)[1]")));
	    
	    
	    a5.card_Number_Field();
	    a5.Nickname_Field();
	    Thread.sleep(40000);
	    a5.Exipiry_Date_Day_Select();
	    a5.Exipiry_Exipiry_Year_Select();
	    Thread.sleep(30000);
		a5.Enter_Card_Details_Button_Click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
