package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties locatorProp ;
	
	
	public static void init() throws Exception 
	{
		
		fis=new FileInputStream("./data.properties");
		p=new Properties();
		p.load(fis);
		
//		
//		fis=new FileInputStream("./locators.properties");
//	     locatorProp = new Properties();
//	     locatorProp.load(fis);
//		
	}
	
	
	public static void launchBrowser(String browser)
	
	{	
			
			if(p.getProperty(browser).equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(p.getProperty(browser).equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
			}
			else if(p.getProperty(browser).equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();	
			}
			else 
			{
				driver=null;
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			System.out.println("Browser Launch Successfully");
	
	}
	
	public static void navigateToUrl(String url)
	{ 
		System.out.println(p.getProperty(url));
		driver.get(p.getProperty(url));
		System.out.println("URL Launch Successfully");
	}
	
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void setup() throws Exception {
		init();
		launchBrowser("chromebrowser");
		navigateToUrl("Appurl");
		

	}
	
	
	
	public static void waits() 
	{
		WebDriverWait ww=new WebDriverWait(driver, 20);
		//ww.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Loc));
	}
		
	public void wrapup() {
		closeBrowser();
	}
		
	
//	public static void setup() throws Exception {
//		init();
//		launchBrowser("chromebrowser");
//		navigateToUrl("Appurl");
//	}

}
