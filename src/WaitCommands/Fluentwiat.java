package WaitCommands;

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

public class Fluentwiat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		//declare the Fluent wait
		
		/* Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(60))
			       .pollingEvery(Duration.ofSeconds(15))
			       .ignoring(NoSuchElementException.class);*/

		 FluentWait wait1=new FluentWait(driver);
		 wait1.withTimeout(Duration.ofSeconds(60));
		 wait1.pollingEvery(Duration.ofSeconds(15));
		 wait1.ignoring(NoSuchElementException.class);
		 
			  
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//usage
		 WebElement ele =(WebElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		    
		
		ele.sendKeys("Admin");

	}

}
