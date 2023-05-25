package Webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contionalmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IsDisplayed
		//IsEnabled
		//IsSelected
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//is displayed
		Boolean regiterele=	driver.findElement(By.xpath("//h1[text()='Register Account']")).isDisplayed();

		System.out.println(regiterele);
		
		//is enabled
		Boolean isdis=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		
		System.out.println(isdis);
		Boolean isselected=driver.findElement(By.xpath("//*[@name='newsletter' and @value='0']")).isSelected();
		
		System.out.println(isselected);
		
		
		
		
	}

}
