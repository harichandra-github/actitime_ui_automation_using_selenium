package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomePage;
import pom.LoginPage;
import pom.ReportsPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest09 extends BaseClass
{
	
	@BeforeMethod
	  public void beforeMethod() throws Exception 
	{
		setup();
	 }
	
  @Test
  public void createChart() throws Exception 
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.adminLogin(p);
	  HomePage hp=new HomePage(driver);
	  hp.Reports.click();
	  ReportsPage rp=new ReportsPage(driver);
	  rp.createPieChart();
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
