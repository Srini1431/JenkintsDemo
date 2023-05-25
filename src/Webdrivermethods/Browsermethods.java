package Webdrivermethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		ele.sendKeys("srini");
		
		 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				 				.withTimeout(Duration.ofSeconds(30))
				 				.pollingEvery(Duration.ofSeconds(5))
				 				.ignoring(NoSuchElementException.class);
		
			
			  WebElement username = wait1.until(new Function<WebDriver, WebElement>(){
			  
			  public WebElement apply(WebDriver driver ) { return
			  driver.findElement(By.xpath("//input[@name='username']")); } });
			 
		 username.sendKeys("srini");
		
		//driver.close();//cureent window
		//driver.quit();//close all windows 
		

	}

}
