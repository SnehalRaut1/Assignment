package snehal_Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Home_page 
{
	WebDriver Driver;
	
	

	// step 1

	@FindBy(id = "nav-link-accountList")
	WebElement Account_and_list;
	
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement Sign_in;

	@FindBy(linkText = "Start here.")
	WebElement Start_Here;
	
	@FindBy(xpath = "//span[.='Manage Profiles']")
	WebElement Manage_Profile;
	
	@FindBy(linkText = "View")
	WebElement View;
	
	@FindBy(xpath = "//div[.='Preferred department']")
	WebElement Preferred_Depatment;
	
	@FindBy(xpath = "//div[.='Add']")
	WebElement Add_Button_Of_Dapartment;

	@FindBy(xpath = "//button[.='Women']")
	WebElement Dapartment_Women;
	
	@FindBy(xpath = "//sapan[.='Save']")
	WebElement Save_Button;
	
	@FindBy(xpath = "(//div[@class='accordion-item'])[2]")
	WebElement Height_And_Weight;
	
	@FindBy(xpath = "//button[.='Add']")
	WebElement Add_Heigh_And_Weight;
	
	
	@FindBy(xpath = "(//input[@class='number-input-box'])[1]")
	WebElement heightincm;
	
	@FindBy(xpath = "(//input[@class='number-input-box'])[2]")
	WebElement WeightinKG;
	
	
	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement save_heightandweight;
	
	
	@FindBy(xpath = "//div[.='Age group']")
	WebElement age_Group;
	
	
	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement select_age_group;
	
	@FindBy(xpath = "(//button[.='Add'])[2]")
	WebElement age_group_add;
	

	@FindBy(xpath = "//button[.='25-29']")
	WebElement age_Box_Select;
	
	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement Save_Age;
	
	@FindBy()
	WebElement Your_Order;
	
	
	@FindBy(xpath="//a[.='Your Account']")
	WebElement YourAccount;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement Your_Ordes;
	
	public void Your_Ordes_Clicking()
	{
		Your_Ordes.click();
	}
	
	public void Your_Account_Clicking()
	{
		YourAccount.click();
	}
	
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[4]")
	WebElement Your_Addresses;
	
	public void Your_Address_Clicking()
	{
		Your_Addresses.click();
	}
	
	@FindBy(xpath="//div[@class='a-box-inner a-padding-extra-large']")
	WebElement Add_Address;
	 
	public void Add_Address_Clicking()
	{
		Add_Address.click();
	}
 	
 	
 	//filling address
	
	@FindBy(name="address-ui-widgets-countryCode")
	WebElement filling_Address;
	
     public void Fillinng_Address_Country_Region()
      {
	    Select s1=new Select(filling_Address);
	    s1.selectByVisibleText("India");
     }

     @FindBy(id="address-ui-widgets-enterAddressFullName")
 	 WebElement full_name;

         public void Full_name_Field() 
 	      {
 	        full_name.sendKeys("snehal shinde ");
 	      }
     
        @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
 	    WebElement mobile_no;

        public void Mobile_Number_Field() 
 	     {
    	   mobile_no.sendKeys("7972378649");
 	     }
	
        @FindBy(id="address-ui-widgets-enterAddressLine1")
 	    WebElement flat_House_Apartment;

        public void Flat_House_Field() 
 	     {
        	flat_House_Apartment.sendKeys("shree vari elite,d block");
 	     }
	
         @FindBy(id="address-ui-widgets-enterAddressLine2")
 	     WebElement Area_Stree_Sector;

        public void Area_Street_Field() 
 	     {
        	Area_Stree_Sector.sendKeys("Aecs layout");
 	     }
	
        @FindBy(id="address-ui-widgets-landmark")
	     WebElement landmark;

        public void landmark_Field() 
	     {
    	   landmark.sendKeys("kundanhalli");
	     }
        
        @FindBy(id="address-ui-widgets-enterAddressCity")
	     WebElement Town_City;

        public void Town_City_Field() 
	     {
   	       Town_City.sendKeys("Bengluru");
	     }
	
        @FindBy(name="address-ui-widgets-enterAddressStateOrRegion")
	     WebElement state;

         public void state_Field() throws InterruptedException 
	      {
        	 Select f1=new Select(state);
        		f1.selectByVisibleText("KARNATAKA");
        		
        		Thread.sleep(5000);
	      }
	
	
         @FindBy(className="a-button-text")
	     WebElement AddAddress_button;

         public void AddAddress_button_Field() 
	      {
        	 AddAddress_button.click();
	      }
         
         
         
         
        
        
	
	
	
	
	// step 2

	public void Hover_over_Account_And_List_component_OF_Amazon_Home_Page(WebDriver Driver) 
	{
		Actions a2 = new Actions(this.Driver = Driver);
		a2.moveToElement(Account_and_list).perform();
	}

	public void Sign_In_Amazon() 
	{
		Sign_in.click();
	}
	
	public void Start_Here_For_Regstration_New_USer() 
	{
		Start_Here.click();
	}

	public void manage_Profile_Click() 
	{
		Manage_Profile.click();
	}
	
	public void Account_Holder_View_Click() 
	{
		View.click();
	}
	
	public void Preferred_Depatment_Click_here() 
	{
		Preferred_Depatment.click();
	}
	
	public void department_Add_Button() 
	{
		Add_Button_Of_Dapartment.click();
	}
	
	public void Women_department_Add_Button() 
	{
		Dapartment_Women.click();
	}
	
	public void Save_Preferred_Depatment_Button_Click() 
	{
		Save_Button.click();
	}
	
	public void Height_and_Weight_Click_HERE() 
	{
		Height_And_Weight.sendKeys(Keys.ENTER);
	}
	
	public void Adding_Button_Heigh_Weight() 
	{
		Add_Heigh_And_Weight.click();
	}
	
	
	public void Height_value_box() 
	{
		heightincm.sendKeys("154");
	}
	
	public void weight_value_box() 
	{
		WeightinKG.sendKeys("55");
	}
	
	public void save_height_Weight_Button() 
	{
		save_heightandweight.click();
	}
	
	public void age_Group_Click() 
	{
		age_Group.click();
	}
	
	public void select_age_group_Box() 
	{
		select_age_group.click();
	}
	
	public void age_group_add_button_Click() 
	{
		age_group_add.click();
	}
	
	public void age_Box_Select_Box_Click() 
	{
		age_Box_Select.click();
	}
	
	public void save_Age_Button_Click() 
	{
		Save_Age.click();
	}
	
	// step 3	

	public Amazon_Home_page(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}

}
