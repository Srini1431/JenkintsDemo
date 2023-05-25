package testngDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {

	
	@Test
	public void test()
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
