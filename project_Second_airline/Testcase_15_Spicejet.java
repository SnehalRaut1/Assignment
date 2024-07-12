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

//reach till payment page and select credit card option enter card option make the payment
@Listeners(Listener_class.class)
public class Testcase_15_Spicejet extends Launch_quit
{

	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void last_payment_page() throws InterruptedException
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
	
	
	    Link_search_result_page l1=new Link_search_result_page(Driver);
	    l1.click_Flight_Details_link(Driver);
	    
	    Spiject_passenger_details_page p1=new Spiject_passenger_details_page(Driver);
	    p1.select_title();
	    p1.enter_firstname();
	    p1.enter_lastname();
	    p1.enter_phonenumber();
	    p1.enter_emailid();
	    p1.enter_towncity(Driver );
	    p1.enter_pass1_firstname();
	    p1.enter_pass1_lastname();
	    p1.enter_pass1_phonenumber();
	    p1.click_next_button();
	    p1.click_next_button();
	    p1.enter_pass3_firstname();
	    p1.enter_pass3_lastname();
	    p1.enter_pass3_phonenumber();
		p1.click_pass_continue_button();
		
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
		
		Spicejet_payment_page paypage=new Spicejet_payment_page(Driver);
		paypage.Click_Promo_code();
		paypage.Select_Prome_Code();
	    paypage.Click_apply_button();
	    paypage.Click_procced_to_pay(Driver);
		
	}
	
	
}
