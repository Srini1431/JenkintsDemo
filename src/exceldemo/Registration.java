package exceldemo;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			WebDriver driver;
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			driver.manage().window().maximize();
			
			
			String file=System.getProperty("user.dir")+"\\testdata\\data.xlsx";
			
			System.out.println(file);
			
			int rows=ExcelUtils.getRowCount(file, "Sheet1");
			System.out.println(rows);
			
			
			for(int i=1;i<=rows;i++)
			{
				//read data from excel
				String fname=ExcelUtils.getCellData(file,"Sheet1",i,0);
				
				System.out.println(fname);
				
				String lname=ExcelUtils.getCellData(file,"Sheet1",i,1);
				String email=ExcelUtils.getCellData(file,"Sheet1",i,2);
				String mobilenumber=ExcelUtils.getCellData(file,"Sheet1",i,3);
				String pwd=ExcelUtils.getCellData(file, "Sheet1", i, 4);
				
				String confrimpwd=ExcelUtils.getCellData(file, "Sheet1", i, 4);
				
				driver.findElement(By.id("input-firstname")).sendKeys(fname);
				
				driver.findElement(By.id("input-lastname")).sendKeys(lname);
				
				driver.findElement(By.id("input-email")).sendKeys(email);
				
				driver.findElement(By.id("input-telephone")).sendKeys(email);
				
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				
				String exp_mvalue=ExcelUtils.getCellData(file,"Sheet1",i,6);
				
				System.out.println(exp_mvalue);
				
					
				String act_mvalue=driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText();
				
				if(exp_mvalue.equals(act_mvalue))
				{
					System.out.println("Test Passsed");
					ExcelUtils.setCellData(file, "Sheet1",i,7,"Passed");
					ExcelUtils.fillGreenColor(file, "Sheet1",i,7);
				}
				else
				{
					System.out.println("Test Failed");
					ExcelUtils.setCellData(file, "Sheet1",i,7,"Failed");
					ExcelUtils.fillRedColor(file, "Sheet1",i,7);
				}
				
			
			}

		}

	}

