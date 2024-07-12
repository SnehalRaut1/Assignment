package project_second_airline;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_quit extends Listener_class
{
	
	
	@BeforeMethod
	public void pre_condition()
	{
		Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.spicejet.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void post_conditon() throws IOException, InterruptedException
	{
		
	    Thread.sleep(5000);
	    Driver.quit();
	}

}
