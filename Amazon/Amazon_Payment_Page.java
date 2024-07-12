package snehal_Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Payment_Page 
{
	WebDriver Driver;

	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
    WebElement payment_method_Credit_Card;
   
    public void Select_payment_method_Credit_Card()
    {
    	payment_method_Credit_Card.click();
    }
	
    
    
    @FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
    WebElement Enter_Card_Detalis;
    
    public void Enter_Card_Detalis_Click_Here()
    {
    	Enter_Card_Detalis.click();
    }
    
    
       
    
    
    @FindBy(name="addCreditCardNumber")
    WebElement card_Number;
    
         public void card_Number_Field()
         {
        	 card_Number.sendKeys("123456789123");
         }
    
         
     @FindBy(name="ppw-accountHolderName")
     WebElement Nickname;
    
         public void Nickname_Field()
         {
        	 Nickname.sendKeys("Snehal");
         }
    
     @FindBy(xpath="(//select[@class='a-native-dropdown pmts-native-dropdown'])")
     WebElement Exipiry_Date_Day;
    
        
     public void Exipiry_Date_Day_Select()
         {
        	 Select S1=new Select(Exipiry_Date_Day);
        	 S1.selectByValue("11");
         }
    
      @FindBy(xpath="//select[@name='ppw-expirationDate_year']")
       WebElement Exipiry_Year;
        
             public void Exipiry_Exipiry_Year_Select()
             {
            	 Select S1=new Select(Exipiry_Year);
            	 S1.selectByValue("2033");
             }
    
         
    
     @FindBy(xpath="//span[@class='a-button a-button-primary pmts-button-input']")
     WebElement Enter_Card_Details;
              
                   public void Enter_Card_Details_Button_Click()
                   {
                	   Enter_Card_Details.click();
                   }
    
    
    
    ///====================Net banking
                   
                   
            
                   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
                   WebElement net_banking;
                   
                   public void payment_option_Net_Banking() throws InterruptedException
                   {
                	   net_banking.click();
                	   Thread.sleep(50000);
                   }
                   
                   @FindBy(xpath="(//span[@class='a-button a-button-dropdown'])[1]")
                   WebElement Dropdown;
                  
                   
                   
                   public void payment_option_Net_Banking_Dropdown_Selection() throws InterruptedException
                   {
                	   
                	   
                	   Select S1=new Select(Dropdown);
                	

                       S1.selectByVisibleText("HDFC Bank");
                   }
    //other upi apps
                   
                   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
                   WebElement other_upi_apps;
                   
                   public void other_upi_apps_Banking_third_option_selection() throws InterruptedException
                   {
                	   other_upi_apps.click();
                	   Thread.sleep(50000);
                   }
                   
                   
 //EMI
                   
                   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
                   WebElement EMI_Option;
                   
                   public void EMI_option_selection() throws InterruptedException 
                   {
                	   EMI_Option.click();
                	   Thread.sleep(50000);
                   }
    
 //Cash on Delivery/Pay on Delivery  
                   
                   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
                   WebElement cash_on_delivery;
                   
                   public void cash_on_delivery_option_selection()
                   {
                	   cash_on_delivery.click();
                	   
                   }
    
    public Amazon_Payment_Page(WebDriver Driver )
	{
		PageFactory.initElements(Driver, this);
	}
}
