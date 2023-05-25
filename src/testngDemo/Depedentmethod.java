package testngDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.*;

public class Depedentmethod {
	
	@Test(priority=0)
	public void openapp()
	{
		
		System.out.println("open app");
		Assert.assertEquals(true, true);
		
	}
	
	@Test(priority=1,dependsOnMethods= {"openapp"})
	public void login()
	{
		System.out.println("login ");
		Assert.assertEquals(false, true);
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp","login"})
	public void search()
	{
		System.out.println("search");
		
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("logout");
		
	}

}
