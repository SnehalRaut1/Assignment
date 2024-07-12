package project_second_airline;
//Test login with invalid credentials
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;
@Listeners(Listener_class.class)
public class TestCase_3_Spicejet extends Launch_quit
{
	
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void Error_Message_diplay()
	{
		 
		
		
		
		Spicejet_Home_page a1=new Spicejet_Home_page(Driver);
		a1.Login();
		
        Spicejet_Login_page L1=new Spicejet_Login_page(Driver);
		
		
		L1.Invalid_mobile_number();
		L1.Invalid_password();
		L1.Login_here();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


