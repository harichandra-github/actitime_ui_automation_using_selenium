package testCases;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

import base.BaseClass;
import pom.AddUserPage;
import pom.CreateNewTaskPage;
import pom.HomePage;
import pom.LoginPage;
import pom.TimeTrackPage;
import pom.UsersPage;
import utility.Utility;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Test01 extends BaseClass
{
	
	
	 @BeforeMethod
	  public void beforeMethod() throws Exception 
	 {
		 setup();
	  }

	

  @Test
  public void test01() throws Exception 
  {
	  
	  LoginPage lp=new LoginPage(driver);
		lp.sendUsername(p.getProperty("User1"));
		lp.sendPassword(p.getProperty("Pass1"));
		lp.clicklogin();
		HomePage hp=new HomePage(driver);
		hp.Users.click();
		UsersPage up=new UsersPage(driver);
		up.clickNewUserButton();
	
		
		/*
		 * up.enterFirstName("hari");
		 * 
		 * up.enterLastName("Ch");
		 * 
		 * up.enterEmail("hari@hari.com");
		 */
		//up.clickSaveSend();
		
		up.enterUserDetails("hari", "ch", "email@email.com");
		
		
		
		
		
		/*
		 * hp.clickTimeTrack();
		 * 
		 * TimeTrackPage ttp=new TimeTrackPage(driver); ttp.clickNewButton();
		 * CreateNewTaskPage cnts=new CreateNewTaskPage(driver);
		 * cnts.newCustomer("customer1", "project1"); //cnts.clickAllActiveCustomer();
		 * //cnts.clikAllActiveProjects(); Utility ut=new Utility();
		 * ut.saveScreenshot("scr1", driver)
		 */;
  }
 
}