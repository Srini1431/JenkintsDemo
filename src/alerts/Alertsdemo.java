package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		//p[contains(text(),'Congratulations! You must have the proper credentials.')]
		
		//p[contains(text(),'Congratulations!')]
		
		String actext=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		System.out.println(actext);
		if(actext.contains("Congratulations!"))
		{
			System.out.println("texts are matched");
		}
		else
		{
			System.out.println("failed");
		}

		
	}

}
