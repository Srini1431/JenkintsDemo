package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		List<WebElement> dropdown=driver.findElements(By.xpath("//*[@class='custom-select']/option"));
		//total of number of options
		System.out.println("length of dropdown  " + dropdown.size());
		
		//print all dropdwon values
		for(int i=0;i<dropdown.size();i++)
		{
			String text=dropdown.get(i).getText();
			System.out.println(text);
			
			if(text.equals("Norway") || text.equals("Italy") )
			{
				dropdown.get(i).click();
				
				
			}
		}

	}

}
