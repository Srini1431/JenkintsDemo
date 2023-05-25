package mouseover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		//switch to the frame
		driver.switchTo().frame("iframeResult");
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("SeleniumTesting");
		
		WebElement copytextbtn=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		
		act.doubleClick(copytextbtn).perform();
		
		driver.switchTo().defaultContent();

	}

}
