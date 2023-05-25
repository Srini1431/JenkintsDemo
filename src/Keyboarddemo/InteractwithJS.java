package Keyboarddemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractwithJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		driver.switchTo().frame(0);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		
		js.executeScript("arguments[0].setAttribute('value','selenium')", firstname);

		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='RESULT_RadioButton-7_0']"));
		
		js.executeScript("arguments[0].click()", radiobtn);

	}

}
