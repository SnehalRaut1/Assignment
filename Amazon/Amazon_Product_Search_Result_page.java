package snehal_Maven.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Product_Search_Result_page 
{
	WebDriver Driver;
	private static final String Xpath = null;
	
	//============================================================================
	@FindBy(id = "twotabsearchtextbox")
	WebElement Search_Text_Field;
	
	
	@FindBy(linkText = "Women's Running Shoes")
	WebElement category;
	
	
	
	
	
	
	@FindBy (xpath = "(//input[@class='s-range-input'])[2]")
	WebElement slider;
	

     public void Slider_Movement() throws InterruptedException
	    {
		for (int i=0;i<=50;i++)
		{
			slider.sendKeys(Keys.ARROW_LEFT);
			
		}
		Thread.sleep(5000);
	    }
	
	
	
	
	   @FindBy (xpath = "//input[@class='a-button-input']")
	   WebElement go;
	
	   public void Go_button_Click()
	   {
	    go.click();
	    }
	
	
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement first_Product;
	
			
			@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
			WebElement first_new_Product;
			
			@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
			WebElement first_new_Product_Bottle;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement AddTo_cart;
	
	
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	WebElement Go_To_cart;
	
	
	@FindBy(xpath="//span[.='2']")
	WebElement Go_To_cart1;
	
	@FindBy(xpath="//input[@class='a-color-link']")
	WebElement remove_From_Cart_item1;
	
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[2]")
	WebElement remove_From_Cart_item2;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement Proceed_To_Buy;
	
	
	@FindBy(id = "s-result-sort-select")
	WebElement sort_by_Newest_arrivals;
	
	public void sort_by_newly_aarival_Select() {
		Select s1 = new Select(sort_by_Newest_arrivals);
		s1.selectByVisibleText("Newest Arrivals");
	}
	
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement Customer_review;
	
	public void Customer_Review_Selection() throws InterruptedException 
	{
		Customer_review.click();
		Thread.sleep(5000);
	}
	
	
	
	
	public void proceedToRetailCheckout_Click()
	{
		Proceed_To_Buy.click();
	}
		
	@FindBy(xpath="//span[.='1,519']")
	WebElement price_Of_Product_datils_page;
	
	public void price_Of_Product_datils_page_Click()
	{
		price_Of_Product_datils_page.click();
	}
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-star a-star-3-5 cm-cr-review-stars-spacing-big'])[1]")
	WebElement product_Review;
	
	public void product_Review_clīck_Movement()
	{
		product_Review.click();
	}
	
	@FindBy(xpath="//h3[.=' Product details ']")
	WebElement  Product_details ;
	
	public void  Product_details_clīck_Movement()
	{
		Product_details.click();
	}
	
	//=====	Write a product review>>>5star rating

	
	@FindBy(xpath="//a[@id='Write-a-product-review_2']")
	WebElement  product_review ;
	
	public void  product_review_clīck_Movement()
	{
		product_review.click();
	}
	
	@FindBy(xpath="//img[@alt='select to rate item four star.']")
	WebElement  Ratings ;
	
	public void  ratings_Four_star()
	{
		Ratings.click();
	}
	
	
	
	
	//---------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	//========================================================================================
	
	public void searching_Product_in_search_Text_Field() 
	{
		Search_Text_Field.sendKeys("shoes");//you can put shoe also
		Search_Text_Field.sendKeys(Keys.ENTER);
	}
	
	public void searching_Product_in_search_Text_Field_new_product() 
	{
		Search_Text_Field.sendKeys("bag");
		Search_Text_Field.sendKeys(Keys.ENTER);
	}
	
	public void searching_Product_in_search_Text_Field_new_product2() 
	{
		Search_Text_Field.sendKeys("bottle");
		Search_Text_Field.sendKeys(Keys.ENTER);
	}
	
	public void category_Womens_Running_shoes() 
	{
		category.click();
	}
	
	
	
	public void Clicking_on_first_Product() 
	{
		first_Product.click();
		
		
	}
	
	public void first_new_Product_Click() 
	{
		first_new_Product.click();
	}
	
	public void first_new_Product_Bottle_click() 
	{
		first_new_Product_Bottle.click();
	}
	
	public void Adding_product_To_cart()
	{
		AddTo_cart.click();
	}
	
	public void Going_to_Cart_PAge()
	{
		Go_To_cart.click();
	}	
	
	
	public void adding_keyboard_in_cart()
	{
		first_Product.click();
	}
	
	public void go_to_cart_click()
	{
		Go_To_cart1.click();
	}
	
	public void removing_product_from_cart()
	{
		remove_From_Cart_item1.click();
	}
	
	public void removing_product_from_cart1()
	{
		remove_From_Cart_item2.click();
	}
	
	
	
	
	
	//========================================================
	
	
	public Amazon_Product_Search_Result_page(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	
	
	
	
	
	
	
	
	

}
