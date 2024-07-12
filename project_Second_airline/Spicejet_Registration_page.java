package project_Second_airline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Registration_page {

	WebDriver Driver;

	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement Title;

	public void TiTle_Selection() // ===========================
	{

		Select s1 = new Select(Title);
		s1.selectByVisibleText("Mrs");

	}

	@FindBy(id = "first_name")
	WebElement First_Name_Middle_Name;

	public void First_Name_Middle_Name_Text_Field()// ===========================
	{

		First_Name_Middle_Name.sendKeys("yuga sandeep");

	}

	@FindBy(id = "last_name")
	WebElement Last_Name;

	public void Last_Name_Text_Field() throws InterruptedException// ===========================
	{

		Last_Name.sendKeys("Raut");
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement Country;

	public void Country_Selection_Dropdown() throws InterruptedException // ===========================
	{

		Select s1 = new Select(Country);
		s1.selectByVisibleText("India ");

		Thread.sleep(5000);

	}

	@FindBy(id = "dobDate")
	WebElement DOB;

	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement month;

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;
	@FindBy(xpath = "//div[@class='react-datepicker_day react-datepickerday--003 react-datepicker_day--keyboard-selected']")
	WebElement day;

	public void date_of_Birth() {
		DOB.click();
	}

	public void select_month() {
		Select s1 = new Select(month);
		s1.selectByValue("16");
	}

	public void select_year() {
		Select s1 = new Select(year);
		s1.selectByValue("1993");
	}

	public void select_day() {
		day.click();
	}

	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement Mobile_Number;

	public void Mobile_Number_Text_Field() throws InterruptedException // ===========================
	{

		Mobile_Number.sendKeys("7972378649");
		Thread.sleep(2000);
	}

	@FindBy(id = "email_id")
	WebElement Email_ID;

	public void Email_ID_Text_Field() throws InterruptedException // ===========================
	{

		Email_ID.sendKeys("snehalshinde4763@gmail.com");
		Thread.sleep(5000);
	}

	@FindBy(id = "new-password")
	WebElement Password;

	public void Password_Text_Field() throws InterruptedException // ===========================
	{

		Password.sendKeys("India12345@");
		Thread.sleep(2000);
	}

	@FindBy(id = "c-password")
	WebElement Confirm_Password;

	public void Confirm_Password_Text_Field() throws InterruptedException // ===========================
	{

		Confirm_Password.sendKeys("india123");
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//input[@class='form-check-input mt-02']")
	WebElement CheckBox_agrree_Terms_Condition;

	public void Terms_Condition_Checkbox_Selection() throws InterruptedException // ===========================
	{

		CheckBox_agrree_Terms_Condition.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//button[.='Submit']")
	WebElement Submit;

	public void Submit_Button_Selection() throws InterruptedException // ===========================
	{

		Submit.click();
		Thread.sleep(2000);
	}

	public Spicejet_Registration_page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
}
