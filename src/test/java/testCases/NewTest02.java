package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.LoginPage;
import utility.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;

public class NewTest02 extends BaseClass {
	
	 @BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		  setup();
	  }

  @Test
  public void validLoginWithTraineeUser() throws Exception, Throwable 
  {

	  LoginPage lp=new LoginPage(driver);
	  lp.traineeLogin(p);
		
	
  }
 
  @AfterMethod
  public void afterMethod() 
  {
	  wrapup();
  }

}
