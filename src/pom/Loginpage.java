package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	//constructor
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	//webelements
	By img_logo=By.xpath("//img[@alt='company-branding']");
	By txt_useranme=By.name("username");
	By txt_password=By.name("password");
	By btn_submit=By.xpath("//button[@type='submit']");
	
	//action methods
	
	public void setUserName(String username)
	{
		driver.findElement(txt_useranme).sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		driver.findElement(btn_submit).click();
	}
	
	public boolean validatelogo()
	{
		boolean status=driver.findElement(img_logo).isDisplayed();
		return status;
	}
	
	
	
}
