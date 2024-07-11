package assignmentrealtedselenium;
/*Assignment 140_"How to skip any test cases in selenium testng?

rough problem"*/
import org.testng.annotations.Test;

import graphql.Assert;

public class Ass_140
{

	@Test//bydefault here priority is 0
	public void Amzon_login()
	{
		
	Assert.assertTrue(false);
	}
	
	@Test(priority=1,dependsOnMethods="Amzon_login")
	public void Amzon_logout()
	{
		
	}
}
