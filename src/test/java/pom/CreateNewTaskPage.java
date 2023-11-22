package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTaskPage {

	@FindBy(xpath="//div[contains(text(),'- Select Customer -')]")
	public WebElement selectCustomer;
	@FindBy(xpath="//div[@class='searchItemList']")
	public WebElement searchitem;
	@FindBy(xpath="//div[contains(text(),'- New Customer -')]")
	public WebElement NewCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	public WebElement EnterCustomerName;
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	public WebElement EnterProjectName;
	@FindBy(xpath="//td[@class='nameCell first']")
	public WebElement EnterTaskName;
	@FindBy(xpath="//div[contains(text(),'Create Tasks')]")
	public WebElement CreateTaskButton;
	@FindBy(xpath="//div[@class='selectedItem'][normalize-space()='- ALL ACTIVE CUSTOMERS -']")
	public WebElement AllActiveCustomers;
	@FindBy(xpath="//div[@class='itemRow selected'][normalize-space()='- ALL ACTIVE PROJECTS -']")
	public WebElement AllActiveProjects;
	
	public CreateNewTaskPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newCustomer(String customerName, String projectName)
	{
		//selectCustomer.click();
		searchitem.click();
		NewCustomer.click();
		EnterCustomerName.sendKeys(customerName);
		EnterProjectName.sendKeys(projectName);
	}
	public void newTask(String TaskName)
	{
		EnterTaskName.sendKeys(TaskName);
		
	}
	public void clickCreateTaskButton()
	{
		CreateTaskButton.click();
	}
	public void clickAllActiveCustomer()
	{
		AllActiveCustomers.click();
	}
	public void clikAllActiveProjects()
	{
		AllActiveProjects.click();
	}
}
