package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
		
		//number of frames inside the webpage
		int n=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("number of frames in webpage " + n);
				
		//switchto frame with name -1
		driver.switchTo().frame("packageListFrame");
		
		//operation
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//back to main page
		
		driver.switchTo().defaultContent();
		
		//switch to the frame with name -2
		driver.switchTo().frame("packageFrame");
		
		//operation
		driver.findElement(By.linkText("WebDriver")).click();
				
		//back to main page
		driver.switchTo().defaultContent();
		
		//classFrame or index -3
		
		//switch to the frame with name -2
		driver.switchTo().frame(2);
				
				//operation
		driver.findElement(By.linkText("org.openqa.selenium")).click();
						
				//back to main page
		driver.switchTo().defaultContent();
		
		
		

	}

}
