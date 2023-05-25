package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Css selector as the locator
		//Tag name with ID--#
		//tagname is optional 
		
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmai.com");
		
		//Tag name with Class--.
	//	driver.findElement(By.cssSelector("input.btn")).click();
		
		//tagname with attribute --[]
		//driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("test");

		
		driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("test");
		
		Thread.sleep(1000);
		//driver.quit();
	}

}
