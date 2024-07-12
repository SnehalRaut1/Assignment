package project_second_airline;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Link_search_result_page;
import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;
import project_Second_airline.Spicejet_Search_flight;
import project_Second_airline.Spicejet_add_on_page;
import project_Second_airline.Spicejet_payment_page;
import project_Second_airline.Spiject_passenger_details_page;
@Listeners(Listener_class.class)
//check if user is able to search the domestic round trip flight
public class Testcase_14_Spicejet extends Launch_quit
{

	
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void domestic_round_trip_flight() throws InterruptedException
	{
		
	}
}
