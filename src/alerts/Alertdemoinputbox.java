package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertdemoinputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		ele.click();
		
		Alert alewindow=wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alewindow.getText());
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		/*
		 * String exptext="You clicked: Ok"; String
		 * alertresult=driver.findElement(By.xpath("//p[@id='result']")).getText();
		 * 
		 * System.out.println(alertresult); if(exptext.equals(alertresult)) {
		 * System.out.println("Alert results are matched"); } else {
		 * System.out.println("Failed"); }
		 */

	}

}
