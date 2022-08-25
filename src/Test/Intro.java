package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Intro {
	
	@AfterSuite
 	public void AfSuite()
 	{
 		System.out.println("im the zero");
 	}
	

 	@BeforeClass
 	public void bfclass()
 	{
 		System.out.println("im before all methods");
 	}
 	
 	@Test(dataProvider="getData")
	public void Demo(String user,String pass)
	{
		System.out.println("Harsha");
		System.out.println(user);
		System.out.println(pass);
	}
 	
 	@Test(groups= {"Smoke"})
 	public void Demo2()
 	{
 		System.out.println("Supriya");
 	}
 	@DataProvider
 	public Object[][] getData()
 	{
 		Object[][] data= new Object[3][2];
 		data[0][0]=("First username");
 		data[0][1]=("First password");
 		data[1][0]=("Second username");
 		data[1][1]=("Second password");
 		data[2][0]=("Third username");
 		data[2][1]=("Third password");
 		return data;
 		
 	}
 	
 	
 }