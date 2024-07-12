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
import project_Second_airline.Spiject_passenger_details_page;
@Listeners(Listener_class.class)
public class Testcase_8_spicejet extends Launch_quit
{
	
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void AddOn_Additional_Cost() throws InterruptedException
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

		a1.from_Selection();
		Thread.sleep(2000);
	
		a1.To_Selection();
	

	//	a1.departure_Date_Click();
	//	Thread.sleep(10000);

		a1.departure_Date_Month_selection();
		Thread.sleep(2000);

		a1.passenger_click();
		

		a1.Add_Adult();
		
		
		a1.currency_selection();
		
		a1.Flight_Search_click();
		
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
	Thread.sleep(2000);
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
	Thread.sleep(4000);
	Spicejet_add_on_page addon=new Spicejet_add_on_page(Driver);
	addon.click_add_on();
	//addon.seat_selection();
	addon.seat_selection1();
	addon.seat_selection2();
	addon.seat_selection3();
	//Thread.sleep(2000);
	addon.click_meal_button(Driver);
	addon.select_meals1();
	Thread.sleep(2000);
	addon.select_meals2();
	Thread.sleep(2000);
	addon.select_meals1();
	addon.click_done();
	Thread.sleep(8000);
	
	addon.click_continue(Driver);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
