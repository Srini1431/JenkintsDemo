package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='country-list']"));
		
		Select dropdown=new Select(ele);
		//System.out.println(dropdown.);
		//dropdown.selectByIndex(4);
		
		//dropdown.selectByVisibleText("China");
		//dropdown.selectByValue("5");
		
		List<WebElement> eledrop=dropdown.getOptions();
		System.out.println(eledrop.size());
		
	}

}
