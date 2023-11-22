package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.CallsTask;
import pom.HomePage;
import pom.LoginPage;
import pom.TasksPage;
import pom.TimeTrackPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest04 extends BaseClass{
	
	
	  @BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		 setup();
	  }
	  
	
	
  @Test
  public void addTask() 
  {
	  LoginPage lp=new LoginPage(driver);
		lp.adminLogin(p);
		
		HomePage hp=new HomePage(driver);
		hp.clickTimeTrack();
		
	   TimeTrackPage ttp=new TimeTrackPage(driver);
	   ttp.clickNewButton();
	   ttp.createNewTask("Hari", driver);
	
	   
		
		 
     	  
     			  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
