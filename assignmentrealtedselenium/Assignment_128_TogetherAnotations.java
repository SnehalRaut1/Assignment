package assignmentrealtedselenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_128_TogetherAnotations
{
	public class Ass_128_TogetherAnnotations 
	{
		@AfterSuite
		public void AfterSuit()
		{
			System.out.println("AfterSuit");
		}
		@BeforeSuite
		public void BeforeSuit()
		{
			System.out.println("@BeforeSuite");
		}
		
		@AfterClass
		public void AC()
		{
			System.out.println("@AfterClass");
		}
		@BeforeClass
		public void BC()
		{
			System.out.println("@BeforeClass");
		}
		
		@AfterTest
		public void AT()
		{
			System.out.println("@AfterTest");
		}
		@BeforeTest
		public void BT()
		{
			System.out.println("@BeforeTest");
		}
		
		@AfterMethod
		public void AM()
		{
			System.out.println("@AfterMethod");
		}
		@BeforeMethod
		public void BM()
		{
			System.out.println("@BeforeMethod");
		}
		
		@Test
		public void test()
		{
			System.out.println("@Test");
		}
		

	}

}
