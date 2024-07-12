package project_second_airline;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_Second_airline.Link_search_result_page;
import project_Second_airline.Spicejet_Home_page;
import project_Second_airline.Spicejet_Login_page;
import project_Second_airline.Spicejet_Search_flight;
import project_Second_airline.Spicejet_logout_page;
@Listeners(Listener_class.class)
//login to page,search flight and logout
public class Testcase_12_Spicejet extends Launch_quit
{
         @Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
         public void login_logout() throws InterruptedException
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
 		
 		
 		    
 		   Spicejet_logout_page o1=new Spicejet_logout_page(Driver);
 		   o1.click_svg_img_search_logout(Driver);
        	o1.click_logout(Driver); 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
         }
	
}
