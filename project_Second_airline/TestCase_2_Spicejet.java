package project_second_airline;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;

//Validate the login functionality with valid credentials 
@Listeners(Listener_class.class)
public class TestCase_2_Spicejet extends Launch_quit
{

	
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void login_With_Correct_credentials()
	{
		
		
		
		
		Spicejet_Home_page a1=new Spicejet_Home_page(Driver);
		a1.Login();
		
		Spicejet_Login_page L1=new Spicejet_Login_page(Driver);
		
		
		L1.mobile_number();
		L1.password();
		L1.Login_here();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
