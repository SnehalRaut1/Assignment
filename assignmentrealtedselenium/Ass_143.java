package assignmentrealtedselenium;
//ass 143:Uisng Listeners print messages and check each others gettig invoke
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.testng.TestNG_Listeners;

@Listeners(TestNG_Listeners.class)
public class Ass_143 
{
	@Test
	public void testcase1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase2()
	{
		
	}

}
