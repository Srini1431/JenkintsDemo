package pom;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	Loginpage obj;
	
	//Loginpage2 obj;
	@BeforeClass
	public void setup() throws InterruptedException
	{
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*"); ChromeDriver driver = new
		 * ChromeDriver(options);
		 */
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	 @Test(priority=0)
	 public void testlogo() 
	 { 
		 obj=new Loginpage(driver); 
		 boolean status=obj.validatelogo();
		 Assert.assertEquals(status, true);
		 }
	 
	@Test(priority=1)
	public void testlogin()
	{
		obj.setUserName("Admin");
		obj.setPassword("admin123");
		obj.ClickSubmit();
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	
	

}
