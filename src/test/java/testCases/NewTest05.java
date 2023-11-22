package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomePage;
import pom.LoginPage;
import pom.TasksPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest05 extends BaseClass 
{
	  @BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		  setup();
	  }

	
  @Test
  public void addCustomer() 
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.adminLogin(p);
	  HomePage hp= new HomePage(driver);
	  hp.clickTasks();
	  TasksPage tp=new TasksPage(driver);
	  tp.createNewCustomer("c1", "Des");
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
