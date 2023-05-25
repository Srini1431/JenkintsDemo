package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//thread.sleep();
		//implicit 
		//explicit and Fluent wait
		WebDriver driver;
		driver=new ChromeDriver();
		
		//Thread.sleep(1000);
		//implicit wait: it will tells the webdriver to wait
		//for certain amount of time before it thorows an no such element exception
		
		//synatx
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.name("email")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
	}

}
