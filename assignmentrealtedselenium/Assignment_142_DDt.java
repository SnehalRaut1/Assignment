package assignmentrealtedselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_142_DDt
{
	static WebDriver Driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream f1=new FileInputStream("c:\\Users\\ssneh\\eclipse-workspace\\Selenium_Project\\Excelsheetfordata\\Excel_Data.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String MoblieNO=NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		System.out.println(MoblieNO);
	String pwd= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
     System.out.println(pwd);
     
     
     ChromeDriver Driver=new ChromeDriver();
 	Driver.get("https://www.amazon.in/");
 	Driver.manage().window().maximize();
 	
 	//Hoverover_signin
 	WebElement Account_Hoverover=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
 	
 	Actions a1=new Actions(Driver);
 	a1.moveToElement(Account_Hoverover).perform();
 	
 	WebElement Sign_in=Driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
 	Sign_in.click();
// 	Sign_in.sendKeys(Keys.ENTER);
 	
 	//login code
      WebElement email= Driver.findElement(By.name("email"));
      email.sendKeys(MoblieNO);
      
      WebElement continue1 = Driver.findElement(By.id("continue"));
      continue1.click();
      
      WebElement password= Driver.findElement(By.name("password"));
      password.sendKeys(pwd);
      
      WebElement signIN = Driver.findElement(By.id("signInSubmit"));
      signIN.click();
	
}

}
