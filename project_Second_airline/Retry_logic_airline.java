package project_second_airline;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic_airline implements IRetryAnalyzer
{

	int initial_count=0;
	 int total_count=3;//no of time we want to rerun that test case
		

	@Override
	public boolean retry(ITestResult result)
	{
		if(initial_count<total_count)
		{
			initial_count++;
			return true;
		}
		
		return false;
	}

}
