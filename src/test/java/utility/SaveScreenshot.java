package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SaveScreenshot {
	
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

}
