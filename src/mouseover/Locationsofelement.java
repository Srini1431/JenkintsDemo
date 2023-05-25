package mouseover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locationsofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println(logo.getLocation());
		
		driver.manage().window().maximize();
		
		System.out.println(logo.getLocation());
		
		
		driver.manage().window().minimize();
		System.out.println(logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println(logo.getLocation());
		
		Point p=new Point(100,100);
		
		driver.manage().window().setPosition(p);
		
		
		
		

	}

}
