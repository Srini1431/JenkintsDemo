package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {

	WebDriver driver;
	//constructor
	public Loginpage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//webelements
	//By img_logo=By.xpath("//img[@alt='company-branding']");
	//By txt_username=By.name("username");
	//By txt_password=By.name("password");
	//By btn_submit=By.xpath("//button[@type='submit']");
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_submit;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement img_logo;
	
	//action methods
	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		btn_submit.click();
	}
	
	public boolean validatelogo()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
	
	
}
