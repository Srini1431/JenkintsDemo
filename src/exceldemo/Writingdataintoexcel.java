package exceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writedata.xlsx");
		
				
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		//creating rows
		
		XSSFRow row1=sheet.createRow(0);
		
		//row1.createCell(0).setCellValue("Selenium");
		//row1.createCell(1).setCellValue("Hyd");
		//row1.createCell(2).setCellValue("java");
		
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<=2;c++)
			{
				System.out.println("Enter a value");
				
				String val=sc.next();
				currentrow.createCell(c).setCellValue(val);
			}
			
		}
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		
		

	}

}
