package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loans {
	@AfterMethod
	public void Afmethod()
	{
		System.out.println("i'm the protector");
	}
	@Test(dependsOnMethods= {"WebLogin"})
	public void APILogin()
	{
		System.out.println("API Credentials");
	}
	@AfterTest
	public void LastExecution()
	{
		System.out.println("im the last");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("Mobile Credentials");
	}
	@Parameters({"URL","CODE"})
	@Test
	public void WebLogin(String url,String code)
	{
		System.out.println("Web Credentials");
		System.out.println(url);
		System.out.println(code);
	}
}
