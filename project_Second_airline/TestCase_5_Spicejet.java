package project_second_airline;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;
import project_Second_airline.Spicejet_Search_flight;
@Listeners(Listener_class.class)
//test the search functionality for round trip flight

public class TestCase_5_Spicejet extends Launch_quit
{

	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void Round_trip_flight() throws InterruptedException
	{
		
		Spicejet_Home_page a2=new Spicejet_Home_page(Driver);
		a2.Login();
		
		Spicejet_Login_page L1=new Spicejet_Login_page(Driver);
		
		
		L1.mobile_number();
		L1.password();
		L1.Login_here();
		Thread.sleep(4000);
	
		Spicejet_Search_flight a1=new Spicejet_Search_flight(Driver);
		Thread.sleep(2000);
		
		a1.round_trip_Selection() ;

		a1.from_Selection();
		Thread.sleep(2000);
	
		a1.To_Selection();
	

	//	a1.departure_Date_Click();
	//	Thread.sleep(10000);

		a1.departure_Date_Month_selection();
		Thread.sleep(2000);
		
		a1.return_date_selection_click();

		a1.passenger_click();
		

		a1.Add_Adult();
		
		
		a1.currency_selection();
		
		a1.Flight_Search_click();
		
		   
		   
		   
		   
		   
		  
		   
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
