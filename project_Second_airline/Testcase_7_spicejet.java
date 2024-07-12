package project_second_airline;
// test for multi city search
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_class.class)
public class Testcase_7_spicejet extends Launch_quit
{
	@Test(retryAnalyzer=project_second_airline.Retry_logic_airline.class)
	public void multi_city_search() throws InterruptedException
	{
		
	
		//driver.switchTo().alert().accept();
		Driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c64-1']")).click();
		Driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		Driver.findElement(By.xpath("//input[@id='From'][1]")).sendKeys("mum");
		Driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		Driver.findElement(By.xpath("(//input[@id='To'])[1]")).sendKeys("kol");
		Driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		Driver.findElement(By.xpath("(//input[@id='datepickerlone'])[1]")).click();
		Driver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[2]")).click();
		Driver.findElement(By.xpath("(//input[@id='To'])[2]")).sendKeys("bhu");
		Driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		Driver.findElement(By.xpath("(//input[@id='To'])[3]")).sendKeys("mum");
		Driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//button[@class='col-lg-4 col-12 booking-flight-btn']")).click();
			
		
		
		
		
		
		
		
		
	}

}
