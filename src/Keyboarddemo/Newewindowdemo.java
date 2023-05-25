package Keyboarddemo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newewindowdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://text-compare.com");
	}

}
