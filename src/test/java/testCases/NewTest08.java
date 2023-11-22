package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomePage;
import pom.LoginPage;
import pom.ReportsPage;

public class NewTest08 extends BaseClass
{

	 @BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		  setup();
	  }
	
	
 @Test
 public void viewMonthlyReport() 
 {
	  LoginPage lp=new LoginPage(driver);
	  lp.adminLogin(p);
	  HomePage hp=new HomePage(driver);
	  hp.Reports.click();
	  ReportsPage rp=new ReportsPage(driver);
	  rp.viewPastMonthLeaveReport();
	
 }


 @AfterMethod
 public void afterMethod() 
 {
	
}
}
