package mouseover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement start_slider=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
		System.out.println(start_slider.getLocation());
		
		//WebElement targetitaly=driver.findElement(By.xpath("//div[@id='box106']"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(start_slider, 100, 250).perform();
		
		System.out.println(start_slider.getLocation());
		
	}

}
