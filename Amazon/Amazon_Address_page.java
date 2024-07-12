package snehal_Maven.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Address_page 
{
	WebDriver Driver;
	
	@FindBy(xpath="//div[@class='a-row address-row list-address-selected']")
    WebElement Selecting_address;
   
    public void selecting_Address_Out_Of_All_Addresses()
    {
   	 Selecting_address.click();
    }

    
    @FindBy(id="shipToThisAddressButton")
    WebElement Use_This_Address;
   
    public void Use_This_Address_Click_Here()
    {
   	 Use_This_Address.click();
    }
   
    //Step 3================================================================================
    public Amazon_Address_page(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}

}
