package testCases;

import base.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.AddUserPage;
import pom.CreateNewTaskPage;
import pom.HomePage;
import pom.LoginPage;
import pom.TimeTrackPage;
import pom.UsersPage;
import utility.ReadExcelFile;
import utility.Utility;

public class UtilityPratice extends BaseClass {
	
	


	@Test
	public void tc01() throws Exception
	{
		/*
		 * LoginPage lp=new LoginPage(driver); lp.sendUsername(p.getProperty("User1"));
		 * lp.sendPassword(p.getProperty("Pass1")); lp.clicklogin(); HomePage hp=new
		 * HomePage(driver); hp.Users.click(); UsersPage up=new UsersPage(driver);
		 * up.clickNewUserButton(); AddUserPage aup=new AddUserPage(driver);
		 * aup.enterUserDetails("hari", "ch", "email@amai.com");
		 */
		
	ReadExcelFile ref=new ReadExcelFile();
	ref.readExcel("Book.xlsx", "Sheet1", 1, 0);
		
	}
	
	
}
