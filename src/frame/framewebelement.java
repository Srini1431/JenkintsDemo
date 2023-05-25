package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framewebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		//number of frames inside the webpage
		int n=driver.findElements(By.tagName("frame")).size();
		
		System.out.println("number of frames in webpage " + n);
				
		//switchto frame using webelement
		
		WebElement ele=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.name("mytext1")).sendKeys("1234");
		
		driver.switchTo().defaultContent();
		
		
	}

}
