package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

//loginbyemail--sanity and regression
//loginamazon--regression
//loginecommerce--sanity

//singupbyemil-sanity and regression
//singupamazon-sanity 
//signupecommerce-sanity


public class Groupsdemo {
	
	@Test(priority=0,groups= {"sanity","regression"})
	public void loginbyemail()
	{
		System.out.println("loginby email");
	}
	
	@Test(priority=1,groups= {"regression"})
	public void loginamazon()
	{
		System.out.println("login in amazon ");
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void loginecommerce()
	{
		System.out.println("login ecommerce");
	}
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void singupbyemil()
	{
		System.out.println("singup by email ");
	}
	@Test(priority=4,groups= {"sanity"})
	public void singupamazon()
	{
		System.out.println("singup amazon");
	}
	
	@Test(priority=5,groups= {"sanity"})
	public void signupecommerce()
	{
		System.out.println("singup ecommerce ");
	}

}
