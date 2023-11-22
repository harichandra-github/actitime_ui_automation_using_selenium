package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallsTask {
	
	@FindBy (xpath="//span[contains(text(),'DETAILS')]")
	public WebElement Details;
	@FindBy(xpath="//div[@class='reportedTime']//span[@class='tabText']")
	public WebElement ReportedTime;
	@FindBy(xpath="//span[contains(text(),'ASSIGNED USERS (5)')]")
	public WebElement AssignedUsers;
	@FindBy(xpath="//span[normalize-space()='MANAGERS (3)']")
	public WebElement Managers;
	@FindBy(xpath="//div[contains(text(),'Add Managers')]")
	public WebElement Addmanager;
	@FindBy(xpath="//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]")
	public WebElement Nowak;
	@FindBy(xpath="//span[@id='ext-gen321']")
	public WebElement close;
	
	public void CallsTaask(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickDetails()
	{
		Details.click();
	}
	public void clickReportedTime()
	{
		ReportedTime.click();
	}
	public void clickAssignedUsers()
	{
		AssignedUsers.click();
	}
	public void clickManagers()
	{
		Managers.click();
	}
	public void clickAddmanager()
	{
		Addmanager.click();
	}
	public void clickNowak()
	{
		Nowak.click();
	}
	public void clickclose()
	{
		close.click();
	}
}
