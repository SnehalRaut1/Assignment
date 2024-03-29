package assignmentrealtedselenium;
/*Assignment 79:Launch an empty browser, Navigate to “amazon.in” login page, 
 * Enter user name > 
 * click on continue, 
 * Enter password > 
 * click on continue, 
 * Click on Login button8
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_79_AmazonLogin
{
public static void main(String[] args) 
{
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104188%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11377255004481037362%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061993%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
  
	WebElement Email=Driver.findElement(By.name("email"));
   Email.sendKeys("rautsandeep0@gmail.com");
   
   WebElement continue1=Driver.findElement(By.id("continue"));
   continue1.click();
   
   WebElement pass=Driver.findElement(By.id("ap_password"));
   pass.sendKeys("Ipl@2023");
   
   WebElement signin=Driver.findElement(By.id("signInSubmit"));
   signin.click();








}

}
