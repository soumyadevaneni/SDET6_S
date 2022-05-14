package Rahul_Udemy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes Before all  Testcases");
		//delete cookies
	}
@AfterTest
public void Cookiesclose()
{
	System.out.println("This block executes after all  Testcases");
	//close the browesers
}
@AfterMethod
public void Reportadding()
{
	System.out.println("This block executes after each Test");
}
	@Test
	public void OpeningBrowser()
	{
	//This opens the Browser
	System.out.println("Executing Test 2");

}
@Test
@Parameters({"adminUserid"})

public void FlightBooking(String Userid)
{
	System.out.println(Userid);
	System.out.println("Executing Test 1");
}

	
	 
  }

