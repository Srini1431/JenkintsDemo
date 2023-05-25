package mouseover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightele=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		
		//right click
		act.contextClick(rightele).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
