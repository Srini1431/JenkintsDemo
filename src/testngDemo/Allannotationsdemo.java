package testngDemo;


import org.testng.annotations.*;

public class Allannotationsdemo {
	
	@BeforeSuite
	public void beforesuite()
	{
		 System.out.println("before suite testng method");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		 System.out.println("before test testng method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		 System.out.println("before class testng method");
	}
	
	
	
	@BeforeMethod
	public void beforemethod()
	{
		 System.out.println("before method testng method");
	}
	
	
	  
	  @Test
	  public void f1() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @Test
	  public void f() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @Test
	  public void f2() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @AfterMethod
		public void aftermethod()
		{
			 System.out.println("after method testng method");
		}
	  
	  @AfterClass
		public void afterclass()
		{
			 System.out.println("after  class testing method");
		}
	  
	  @AfterTest
		public void aftertest()
		{
			 System.out.println("after test testng method");
		}

	  @AfterSuite
		public void aftersuite()
		{
			 System.out.println("after suite testng method");
		}
		


}
