package multiplewindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//getwindow()--
		//getwindowhandles()
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> windows=driver.getWindowHandles();
		
		for(String win:windows)
		{
			String Childwindow=win;
			
			if(!parentwindow.equals(Childwindow))
			{
				String title=driver.getTitle();
				System.out.println(title);
				if(title.equals("OrangHRM"))
				{
					driver.close();
				}
				driver.switchTo().window(Childwindow);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[1]/a/button")).click();
				driver.close();
				
			}
			
			
		}
		driver.switchTo().window(parentwindow);
		
		System.out.println(driver.getTitle());
		
		
	}

}
