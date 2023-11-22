package pom;

import base.*;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement password;

	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotpassword;
	
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendUsername(String user) {
		username.sendKeys(user);
	}

	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clicklogin() {
		loginbutton.click();
	}

	public void forgetpassClick() {
		forgotpassword.click();
	}
	 public void traineeLogin(Properties p)
	 {
		 sendUsername(p.getProperty("User2"));
		 sendPassword(p.getProperty("Pass2"));
		 clicklogin();
		 System.out.println("Trainee User Login into application successfully");
	 }
	 public void adminLogin(Properties p)
	 {
		 sendUsername(p.getProperty("User1"));
		 sendPassword(p.getProperty("Pass1"));
		 clicklogin();
		 System.out.println("Admin User Login into application successfully");
	 }

}
