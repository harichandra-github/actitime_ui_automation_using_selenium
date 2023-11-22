package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	public void readExcel(String fileName,String sheetName,	  int rowNum,int cellNum) throws IOException
	{
		String path="./data/"+fileName;
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sh = wb.getSheet(sheetName);
	
		XSSFRow rw = sh.getRow(rowNum);
		XSSFCell cl = rw.getCell(cellNum);
	
	    String clValue= cl.getStringCellValue();
	    System.out.println(clValue);
	}

}
