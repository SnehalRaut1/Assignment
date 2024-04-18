package assignmentrealtedselenium;
/*Assignment 122:How to get the link text of all the links present on a web page? 
Out of all links how many links have link text as null or empty?*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_122LinkTextOFLinks 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		int count=all_links.size();
		System.out.println( "Count of total link " + count);
		int sum=0;
		
		for(int i=0;i<count;i++)
		{
			WebElement single_link=all_links.get(i);
			
			String LinkText=single_link.getText();
			System.out.println( LinkText);//only message showing means empty string "Link Text of links " +
			
			
			boolean emptylinkText=LinkText.isEmpty();
			System.out.println(emptylinkText);
			
			if(emptylinkText==true)
			{
				sum=sum+1;
				
			}
			
			//System.out.println("Total Link present " + count);
			System.out.println("This link dont have link text "+ sum);//"empty link text "+
			
			
			//String Actual_Link=single_link.getAttribute("href");//link haviin href means actual link
			//System.out.println("Actual link having Href tag "+Actual_Link);
			
			
			
		       
		}
		}
}
