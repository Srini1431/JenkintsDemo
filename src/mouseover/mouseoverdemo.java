package mouseover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseoverdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		Thread.sleep(2000);
		WebElement macele=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		//Mouse over
		
		Actions act=new Actions(driver);
		Action build=act.moveToElement(desktop).moveToElement(macele).click().build();
		build.perform();
		
		
		//act.moveToElement(desktop).moveToElement(macele).click().perform();
		
	}

}
