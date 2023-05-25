package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		
		
	}
	@Test(dataProvider="dp")
	public void testlogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String exptitle="E commerce";
		String acttitle=driver.getTitle();
		Assert.assertEquals(exptitle, acttitle);
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}
	@DataProvider(name="dp",indices= {2})
	String [][] logindata()
	{
		String data[][]= {{"abc@gmail.com","abc@123"},
						 {"abcd@gmail.com","abcd@123"},
						 {"test@gmail.com","abc@123"}
						};
		
		return data;
						   
		
		
		}

}
