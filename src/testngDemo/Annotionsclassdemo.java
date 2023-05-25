package testngDemo;

import org.testng.annotations.*;

public class Annotionsclassdemo {
	
	@BeforeClass
	public void beforeclass()
	{
		 System.out.println("before class testng method");
	}
	  
	  @Test
	  public void f1() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @Test
	  public void f2() {
		  
		  System.out.println("first testng method");
	  }
	  
	  @AfterClass
		public void afterclass()
		{
			 System.out.println("after  class testing method");
		}


}
