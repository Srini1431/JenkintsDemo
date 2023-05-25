package Navigation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigationmethodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to()-- is the method and pass url 
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		/*
		 * driver.navigate().to("https://itera-qa.azurewebsites.net/");
		 * driver.navigate().back(); System.out.println(driver.getTitle());
		 * 
		 * driver.navigate().forward();
		 * 
		 * System.out.println(driver.getTitle());
		 */
		driver.navigate().refresh();

		
		
		
	}

}
