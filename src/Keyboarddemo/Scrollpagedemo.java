package Keyboarddemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollpagedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//scroll down page by pixel
		
		//js.executeScript("window.scrollBy(0,5000)", "");
		
		
		//scroll down the page until the element is present
		
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Flag of Norway']"));
		
		//js.executeScript("arguments[0].scrollIntoView()", ele);
		
		
		//scroll down end of page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		
		//scroll back to normal
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");

		
		
	}

}
