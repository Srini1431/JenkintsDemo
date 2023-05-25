package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatros {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//ID, NAme, Link Text, Parital text, ClassName, TagName, CSS Selector
		
		//XPath
		
		WebDriver driver;
		driver=new ChromeDriver();
		//driver=new ();
		//driver=new EdgeDriver();
		//FirefoxDriver d=new FirefoxDriver();
		//EdgeDriver ed=new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//to maximize the browser
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Id locator
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).click();
		//driver.findElement(By.id("input-email")).sendKeys("Sample@gmail.com");
		
		//Name locator
		driver.findElement(By.name("password")).sendKeys("Test@123");

		
		//link Text
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//Partial text
		
		//driver.findElement(By.partialLinkText("Address")).click();
		
		Thread.sleep(1500);
		
		//class Name-- for identifying mulitple webelements
		
		//Findelements
		List<WebElement> links=driver.findElements(By.className("list-group-item"));
		//to find size of list size()
		System.out.println(links.size());
		//Closing browser
		
		//TagName
		List<WebElement> alinks=driver.findElements(By.tagName("a"));
		System.out.println(alinks.size());
		
		List<WebElement> imglinks=driver.findElements(By.tagName("img"));
		System.out.println(imglinks.size());//
		
		List<WebElement> btnlinks=driver.findElements(By.tagName("button"));
		System.out.println(btnlinks.size());//
		
		
		//Findelement and FindElements
		
		//Sceanrio- 1: Single locator
		//findelement --it will take locator and return webelement
		//Findelements--it will take locator and return webelement
		
		//Sceanrio- 2: Multiple locators
		//findelement --it will take locator and perform first occurance in the UI
		
		//Findelements--it will take locator and return webelements
		
		
		//Sceanrio- 3: No locator
		//findelement --org.openqa.selenium.NoSuchElementException
		//Findelements--it will not return any error , it will hold zero values 
		//returns size of list is Zero
		
		//CSS selector
		
		//driver.findElement(By.cssSelector("input#input-email")).sendKeys("Sample@gmail.com");
		
		driver.findElement(By.cssSelector("input#input-email.form-control")).sendKeys("Sample@gmail.com");
		
		
		
		//Closing browser
		//driver.quit();
		
	}

}
