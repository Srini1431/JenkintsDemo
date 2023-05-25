package testngDemo;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2)
  public void f() {
	  
	  System.out.println("first testng method");
  }
  
  @Test(priority=1)
  public void f1() {
	  
	  System.out.println("first testng method");
  }
  
  @Test(priority=6)
  public void f2() {
	  
	  System.out.println("first testng method");
  }
}
