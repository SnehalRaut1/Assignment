package snehal_Maven.Selenium;
//Verify that searching with filters (category ,price range)

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class TestCase_6_Amazon extends Lunch_Quit
{
	
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void Searching_with_filters_Category_Price()
	{
		
		ChromeDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
