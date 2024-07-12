package project_Second_airline;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet_Search_flight
{
	WebDriver Driver;
	
	@FindBy(xpath = "(//div[.='one way'])[3]")
	WebElement one_way;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from_location;
	
	@FindBy(xpath = "//div[.='round trip']")
	WebElement round_trip;
	


	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement To_location;
	
	@FindBy(xpath = "//div[.='Departure Date']")
	WebElement dparture_Date;
	
	@FindBy(xpath = "(//div[.='31'])[1]")
	WebElement dparture_Date_Selection;
	
	@FindBy(xpath = "//div[.='1 Adult']")
	WebElement passenger;
	
	
	
	   
	  
	 
	
	@FindBy(xpath = "//div[.='Return Date']")
	WebElement Return_Date;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[20]")
	WebElement return_Date_Selection;
	
	public void return_date_click()
	{
		Return_Date.click();
	}
	public void return_date_selection_click()
	{
		return_Date_Selection.click();
	}
	
	
	
	@FindBy(xpath = "(//div[.='Flights'])[1]")
	WebElement flight;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[31]")
	WebElement selectdatedeparture;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement Add_Adult_plus;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[3]")
	WebElement currency;
	
			
			@FindBy(xpath = "(//div[.='Search Flight'])[3]")
			WebElement search_flight;
	
	public void flight_sleect()
	{
		flight.click();
	}
	
	
	public void One_Way_Selection() 
	{
		one_way.click();
	}
	public void round_trip_Selection() 
	{
		round_trip.click();
		
	}
	
	public void from_Selection() 
	{
		WebDriverWait w1=new  WebDriverWait(Driver, Duration.ofSeconds(30));
		w1.until(ExpectedConditions.elementToBeClickable(from_location));

		from_location.sendKeys("BLR");
		
		
		
	}
	public void To_Selection()
	{
		
		
		To_location.sendKeys("BOM");
	}
	public void departure_Date_Click() throws InterruptedException
	{
		dparture_Date.click();
	
	}
	
	public void departure_Date_Month_selection() throws InterruptedException
	{
		dparture_Date_Selection.click();

	}
	
	public void passenger_click()
	{
		passenger.click();
	}
	
	

	

	public void Add_Adult()
	{
	   for(int i=1;i<=1;i++)
	   {
		   Add_Adult_plus.click();
	   }
	
	}
	
	

	
	public void currency_selection() throws InterruptedException
	{
		 currency.click();
		
	
	}
	  
	   
			  
	public void Flight_Search_click()
	{
		search_flight.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
	
	public Spicejet_Search_flight( WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
