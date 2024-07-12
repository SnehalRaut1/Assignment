package project_second_airline;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Link_search_result_page;
import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;
import project_Second_airline.Spicejet_Search_flight;
import project_Second_airline.Spiject_passenger_details_page;
@Listeners(Listener_class.class)
//validate the system ability to handle multiple passenger in a single booking
public class Testcase_9_Spicejet extends Launch_quit
{
   @Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
   public void handle_multiple_passenger() throws InterruptedException
   {
	   
	   
		
		Spicejet_Home_page a2=new Spicejet_Home_page(Driver);
		a2.Login();
		
		Spicejet_Login_page L1=new Spicejet_Login_page(Driver);
		
		
		L1.mobile_number();
		L1.password();
		L1.Login_here();
		Thread.sleep(4000);
		Spicejet_Search_flight s1=new Spicejet_Search_flight(Driver);
		Thread.sleep(4000);
		s1.from_Selection();
		s1.To_Selection();
		Thread.sleep(2000);
		//seaflight1.click_departure_date();
		//Thread.sleep(2000);
		//seaflight1.select_date();
		s1.departure_Date_Month_selection();
		Thread.sleep(2000);
		


		s1.passenger_click();
		

		s1.Add_Adult();
		
		
		s1.currency_selection();
		
		s1.Flight_Search_click();
		
		Link_search_result_page searchres=new Link_search_result_page(Driver);
		Thread.sleep(4000);
		searchres.click_Flight_Details_link(Driver);
		searchres.scroll_flightinfo(Driver);
		Thread.sleep(2000);
		searchres.click_baggagelink();
		Thread.sleep(2000);
		searchres.click_cancellationlink();
		
		Link_search_result_page searchpage=new Link_search_result_page(Driver);
		searchpage.click_continue_button();
		
		Spiject_passenger_details_page passdetails=new Spiject_passenger_details_page(Driver);
		passdetails.enter_towncity(Driver);
		passdetails.enter_firstname();
		passdetails.enter_lastname();
		passdetails.enter_phonenumber();
		passdetails.click_next_button();
		passdetails.enter_pass2_firstname();
		passdetails.enter_pass2_lastname();
		passdetails.enter_pass2_phonenumber();
		passdetails.click_next_button();
		passdetails.enter_pass3_firstname();
		passdetails.enter_pass3_lastname();
		passdetails.enter_pass3_phonenumber();
		passdetails.click_pass_continue_button();
	} 
	   
	   
	   
	   
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

