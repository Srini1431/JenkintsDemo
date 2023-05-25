package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftassertionsdemo {
	
	/*
	 * @Test public void test() {
	 * 
	 * System.out.println("first testng method");
	 * System.out.println("first testng method");
	 * System.out.println("first testng method");
	 * System.out.println("first testng method"); Assert.assertEquals(true, false);
	 * 
	 * System.out.println("first testng method"); }
	 */
	 @Test
	  public void softassertion() {
		  
		  System.out.println("first testng method");
		  System.out.println("first testng method");
		  System.out.println("first testng method");
		  System.out.println("first testng method");
		  
		  SoftAssert obj=new SoftAssert();
		  
		  obj.assertEquals(true, false);
		  System.out.println("first  method");
		  
		  obj.assertAll();
	  }
}
