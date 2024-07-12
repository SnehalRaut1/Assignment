package snehal_Maven.Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class TestCase_4_Amazon extends Lunch_Quit
{
	@Test(retryAnalyzer=snehal_Maven.Selenium.RetryLogic.class)
	public void User_can_Successfully_Edit_Profile_Information()
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
  		
  		a2.manage_Profile_Click();
  		a2.Account_Holder_View_Click();
  		a2.Preferred_Depatment_Click_here();
  		a2.department_Add_Button();
  		a2.Women_department_Add_Button();
  		a2.Save_Preferred_Depatment_Button_Click();
  		a2.Height_and_Weight_Click_HERE();
  		a2.Adding_Button_Heigh_Weight();
  		a2.Height_value_box();
  		a2.weight_value_box();
  		a2.save_height_Weight_Button();
  		a2.age_Group_Click();
	    a2.select_age_group_Box();
	    a2.age_group_add_button_Click();
	    a2.age_Box_Select_Box_Click();
	    a2.save_Age_Button_Click();
  		
  		
  		
  		
	}

}
