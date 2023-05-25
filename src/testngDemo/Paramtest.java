package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramtest {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void setup(String browser, String url) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();	
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	@Test(priority=0)
	public void testlogo()
	{
		try {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	@Test(priority=1)
	public void testTitle()
	{
		String exptitle="OrangeHRM";
		String acttitle=driver.getTitle();
		Assert.assertEquals(exptitle, acttitle,"Titles are not matched");
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}

}
