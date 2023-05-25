package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Absoulte xpath--complete path of element--/
		//html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		
		//Relative xpath--pointing to direct element--//
		
		//*[@id="input-email"]
		//syntax: //tagname[@attribute='value']
		//*[@attribute='value']
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test");
		
		//TExt()-locating elements with static visible text
		
		//tagname[text()='text']
		//*[text()='Downloads']
		
		//contains()--locating elements when part of the static visible text(partial match)
		//tagname[contains(text(),'partial substring')]
		//a[contains(text(),'Softwar')]
		//*[contains(@name,'email')]
		
		//dyanimc changing of attribute values
		//tagname[contains(@id,'substring')]
		//*[contains(@name,'email')]
		//*[contains(@placeholder,'E-Mail')]
		
		
		//starts-with--locating elements when prefix of the inner text is static
		//syntax:
		//tagname[starts-with(text(),'prefix of inner text')]

		//value--locating elements with visible text in input elements
		//tagname[@value='visibletext')]
		//*[@value='test']
		
		//xpath operators: or and 
		//input[@id='input-email' or @name='email'] 
		
		//input[@id='input-email' and @name='email'] 
		
		//parent xpath --parent of current element
		//input[@name='email']/parent::div
		
		//ancestor--parent of parent
		
		//input[@name='email']/ancestor::form
		
		
		//Child
		//div[@class='form-group']//label[contains(text(),'Address')]
		//div[@class='form-group']/child::label[contains(text(),'Address')]
		
		//child of child : descendant
		//form[@id='form-currency']/div/button
		
		//follwoing-sibling
		
		//label[text()='E-Mail Address']/following-sibling::input
		
		///html/body/div[2]/div/div/div/div[2]/div/form/div[1]/label
		//*[@id="content"]/div/div[2]/div/form/div[1]/label
		
		
	}

}
