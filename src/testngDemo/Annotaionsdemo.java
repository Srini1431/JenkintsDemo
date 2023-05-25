package testngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaionsdemo {
	
	@BeforeMethod
	public void beforemethod()
	{
		 System.out.println("before testng method");
	}
	  
	  @Test(priority=0)
	  public void f1() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @Test(priority=2)
	  public void f2() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @AfterMethod
		public void aftermethod()
		{
			 System.out.println("after testing method");
		}

}
