package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertionsdemo {
	
	@Test(priority=0)
	public void openapp()
	{
		
		int a=10;
		int b=15;
		/*
		 * if(a==b) { System.out.println("passed"); } else {
		 * System.out.println("failed"); }
		 */
		
		//Assert.assertEquals(true, false);
		//Assert.assertTrue(true);
		
		//Assert.assertTrue(false);
		
		//Assert.assertEquals(a, b);
		if(false)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	

}
