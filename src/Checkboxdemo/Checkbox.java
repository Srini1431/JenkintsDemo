package Checkboxdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		//select the specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='thursday']")).click();
		
		//total number of checkboxes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		int len=checkboxes.size();
		System.out.println("size of checkboxes " +len);
		//check all checkboxes
		
		  for(int i=0;i<len;i++) { 
			  checkboxes.get(i).click();
		 
		 }
		 
		//last 2 checkboxes
		/*
		 * for(int i=5;i<len;i++) { checkboxes.get(i).click();
		 * 
		 * }
		 */
		  
		  Thread.sleep(3000);
		  for(int i=4;i<len;i++) { 
			  if(checkboxes.get(i).isSelected()) {
				  checkboxes.get(i).click();
			  }
			 
		 
		 }
		  for(WebElement Chkboxes:checkboxes)
		  {
			  Chkboxes.click();
		  }
		

	}

}
