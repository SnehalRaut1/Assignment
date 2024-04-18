package assignmentrealtedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_123 
{
public static void main(String[] args)
{

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	List<WebElement> all_links=driver.findElements(By.tagName("a"));
	int count=all_links.size();
	System.out.println(count);
	int sum=0;
	
	for(int i=0;i<count;i++)
	{
		WebElement single_link=all_links.get(i);
		
		String href_link=single_link.getAttribute("href");
		System.out.println(href_link);
		
		
}
	}
}











/*boolean ans= href_link.isEmpty();
		System.out.println(ans);
		
		if(ans==true)
		{
			sum=sum+1;
		}
		System.out.println(sum);*/
