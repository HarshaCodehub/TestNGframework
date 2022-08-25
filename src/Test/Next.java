package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Next {
	@AfterClass
	public void afClass()
	{
		System.out.println("im after all methods");
	}
	@Test(timeOut=4000)
	public void Bug()
	{
		System.out.println("Bug Report");
	}
	@Test(groups= {"Smoke"})
	public void Gloan()
	{
		System.out.println("Gold");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("iam first");
	}
}
