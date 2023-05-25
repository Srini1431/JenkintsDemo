package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//1.Open the Browser
//2.Naviagate to the url
//3.Enter the username
//4.Enter the password.
//5.Click on the login button
//6.validate the title of page



public class WebDriverdemo1 {

	public static void main(String[] args) throws InterruptedException {
		
	//System.setProperty("webdriver.chorme.driver", "C:\\Chromedriver\\chromedriver.exe");
	
	WebDriver driver;
	driver=new ChromeDriver();
	//driver=new ();
	//driver=new EdgeDriver();
	//FirefoxDriver d=new FirefoxDriver();
	//EdgeDriver ed=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//WebElement ele=driver.findElement(By.name("username"));
	//ele.sendKeys("Admin");
	
	Thread.sleep(2000);
	
	//username text box
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//pwd text box
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	
	//clicking on submit button
	
	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String exp="Dashboard";
	String text=driver.findElement(By.xpath("//h6[contains(text(),'')]")).getText();
	System.out.println(text);
if(exp.equals(text))
{
	System.out.println("We are on the home page");
}
driver.findElement(By.xpath("//h6")).isDisplayed();
	driver.close();
	
		
	}

}
