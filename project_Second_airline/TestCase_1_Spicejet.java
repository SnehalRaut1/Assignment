package project_second_airline;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Registration_page;

@Listeners(Listener_class.class)
public class TestCase_1_Spicejet extends Launch_quit
{
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	
	
	public void New_User_Registration_Spicejet() throws InterruptedException
	{
		
	
		Spicejet_Home_page t1=new Spicejet_Home_page(Driver);
		t1.Hover_over_SignUP();
		
		Set<String> g1=Driver.getWindowHandles();
		
	    Iterator<String> g2=	g1.iterator();
	
	    String S1= g2.next();
	    String S2=g2.next();
	
	    Driver.switchTo().window(S2);
	    
	    //Driver.switchTo().alert().accept();
	    
	    Spicejet_Registration_page r1=new Spicejet_Registration_page(Driver);
	    r1.TiTle_Selection();
	    
	    r1.First_Name_Middle_Name_Text_Field();
	    r1.Last_Name_Text_Field();
	    r1.Country_Selection_Dropdown();
	    r1.Mobile_Number_Text_Field();
	    Thread.sleep(10000);
	    r1.date_of_Birth();
	    r1.select_month();
	    r1.select_year();
	    r1.select_day();
	   
	    
	    r1.Email_ID_Text_Field();
	    r1.Password_Text_Field();
	    r1.Confirm_Password_Text_Field();
	    r1.Terms_Condition_Checkbox_Selection();
	    r1.Submit_Button_Selection();
		
	    
	    
	    /*String month=" november 1993";
	    String Day="16";
	    
	    @FindBy(id="dobDate")
	    WebElement datepic;
	    
	    public void date_Click()
	    {
	    	datepic.click();
	    	Thred.Sleep(5000);
	    }*/
	    
		

}
}