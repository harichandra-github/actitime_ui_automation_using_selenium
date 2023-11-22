package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
	
    @FindBy (xpath="//input[@name='firstName']")
	public WebElement FirstName;
    @FindBy(xpath="//input[@id='createUserPanel_lastNameField']")
    public WebElement LastName;
    @FindBy(xpath="//input[@id='createUserPanel_emailField']")
    public WebElement Email;
    @FindBy(xpath="//div[contains(text(),'Save & Send Invitation')]")
    public WebElement SaveSendButton;
    
    public AddUserPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterFirstName(String firstname)
    {
    	FirstName.sendKeys(firstname);
    }
    public void enterLastName(String lastname)
    {
    	LastName.sendKeys(lastname);
    }
    public void enterEmail(String email)
    {
    	Email.sendKeys(email);
    }
    public void clickSaveSend()
    {
    	SaveSendButton.click();
    }
    public void enterUserDetails(String firstname,String lastname,String email)
    {
    	FirstName.sendKeys(firstname);
    	LastName.sendKeys(lastname);
    	Email.sendKeys(email);
    	SaveSendButton.click();
    	
    }
}
