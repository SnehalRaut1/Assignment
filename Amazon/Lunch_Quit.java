package snehal_Maven.Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Lunch_Quit extends ListenersClass
{
	
	@BeforeMethod
	public void pre_condition()
	{
		Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void post_conditon() throws IOException, InterruptedException
	{
		
	    Thread.sleep(5000);
	    Driver.quit();
	}

}
