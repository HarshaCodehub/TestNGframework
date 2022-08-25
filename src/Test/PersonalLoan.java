package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	@Test(groups= {"Smoke"})
	public void APILogin()
	{
		System.out.println("Home API Credentials");
	}
	@Parameters({"URL","CODE"})
	@BeforeMethod
	public void bfmethod(String url,String code)
	{
		System.out.println("im a mediator");
		System.out.println(url);
		System.out.println(code);
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("iam the Hero");
	}
	@Test(enabled=false)
	public void HomeMobileLogin()
	{
		System.out.println("Home Mobile Credentials");
	}
	@Test
	public void HomeWebLogin()
	{
		System.out.println("Home Web Credentials");
		
	}
}
