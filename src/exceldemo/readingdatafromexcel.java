package exceldemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f=new File();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total number of rows "+ totalrows);
		
		System.out.println("total number of cells "+ totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
		//	XSSFCell value=currentrow.getCell(c);
			
			String value=currentrow.getCell(c).toString();
			System.out.println(value);
			}
			
		}
		
		workbook.close();
		file.close();
		
	}
	
	

}
