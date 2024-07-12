package snehal_Maven.Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class TestCase_1_Amazon extends Lunch_Quit
{

	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void New_User_Registration_Amazon()
	{
		
	
		Amazon_Home_page a1=new Amazon_Home_page(Driver);
		
		a1.Hover_over_Account_And_List_component_OF_Amazon_Home_Page(Driver);
		a1.Start_Here_For_Regstration_New_USer();
		
		Amazon_Registration_page r1=new Amazon_Registration_page(Driver);
				
		r1.First_And_Last_Name_Of_Registarion_Page();
		r1.Mobile_Number_Of_Registarion_Page();
		r1.password_Of_Registarion_Page();
		r1.Verify_Button_Of_Registarion_Page();
		
	}
}
