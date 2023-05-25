package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		
		//Getmethods
		//Get(url)--
		//GetTitle()
		//Getcurrent url
		
		//getpage source
		//Getwindow
		//Getwindows
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("title of the page "+ title);
		
		String url=driver.getCurrentUrl();
		System.out.println("url of the page "+ url);
		
		String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		System.out.println(pagesource.contains("We're sorry but orangehrm"));
		
		String window=driver.getWindowHandle();//current window
		System.out.println(window);//4F49312970777BA6FFD4FBDBCFA23536
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("parent window id is " + parentwindow);
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(2000);
		
		Set<String> windows=driver.getWindowHandles();//multiple windows
		
		for(String win:windows)
		{
			String chlidwindow=win;
			if(!parentwindow.equals(chlidwindow))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
				
				driver.close();
			}
		
			System.out.println(win);
		}
		driver.switchTo().window(parentwindow);
		
		String title1=driver.getTitle();
		System.out.println("title of the page "+ title1);
		
	}

}
