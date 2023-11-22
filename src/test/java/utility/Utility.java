package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;



public class Utility
{
	public void saveScreenshot(String screenshotName, WebDriver driver)
	{
	
	File sourceScrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	File DestScrShot=new File("./Screenshot/"+screenshotName+".png");
	
	try 
	{
		Files.copy(sourceScrShot, DestScrShot);
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Screenshot taken");
	
	}
	
	public Cell getData(String fileName,String sheetName,int rowNum,int cellNum) 
	
	{ 
		String path="./data/"+fileName;
		
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(path);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     XSSFWorkbook wb=null;
		try {
			wb = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     XSSFSheet  sh = wb.getSheet(sheetName);
	     
		 XSSFRow  row= sh.getRow(rowNum);
		 System.out.println();
		XSSFCell cl=row.getCell(cellNum);
		 
		return cl;
		
		
		
	}
}
