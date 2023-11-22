package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomePage;
import pom.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest03 extends BaseClass{
 
  @BeforeMethod
  public void beforeMethod() throws Exception
  {
	  setup();
  }
  
  @Test
  public void SectionsVisible() 
  {
	  LoginPage lp=new LoginPage(driver);
		lp.adminLogin(p);
		
		HomePage hp=new HomePage(driver);
		hp.sectionsVisible();
  }

  

  @AfterMethod
  public void afterMethod() 
  {
	 // wrapup();
  }

}
