package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.LoginPage;
import utility.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;

public class NewTest01 extends BaseClass {
	@BeforeMethod
	  public void beforeMethod() throws Exception
	{
		setup();
	 }
  @Test
  public void validLoginWithAdmin() 
  {

	  LoginPage lp=new LoginPage(driver);
		lp.adminLogin(p);
		
		
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	//  wrapup();
  }

}
