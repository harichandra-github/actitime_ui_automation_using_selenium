package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

	@FindBy(xpath="//div[@class='title ellipsis']")
	public WebElement AddNewButton;
	@FindBy(xpath="//div[@class='item createNewTasks']")
	public WebElement CreateNewTask;
	@FindBy(xpath="/html[1]/body[1]/div[51]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	public WebElement EnterTaskName;
	@FindBy(xpath="//div[contains(text(),'Create Tasks')]")
	public WebElement CreateTaskButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	public WebElement NewCustomer;
	
	/*
	 * @FindBy(xpath="//td[@class='nameCell first']") public WebElement
	 * EnterTaskName;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Create Tasks')]") public WebElement
	 * CreateTaskButton;
	 */
	@FindBy(xpath="//div[@class='selectedItem'][normalize-space()='- ALL ACTIVE CUSTOMERS -']")
	public WebElement AllActiveCustomers;
	@FindBy(xpath="//div[@class='itemRow selected'][normalize-space()='- ALL ACTIVE PROJECTS -']")
	public WebElement AllActiveProjects;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	public WebElement EnterCustomerName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	public WebElement EnterCustomerDescription;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	public WebElement CreateCustomerButton;
	@FindBy(xpath="//div[@class='item createNewProject']")
	public WebElement NewProject;
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	public WebElement EnterProjectName;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	public WebElement EnterProjectDes;
	@FindBy(xpath="//div[contains(text(),'Create Project')]")
	public WebElement CreateProjectButton;
	@FindBy(xpath="//body[1]/div[55]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	public WebElement EnterTaskNameP;
	@FindBy(xpath="//div[normalize-space()='-- New Customer --']")
	public WebElement CustomerDropDown;
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		AddNewButton.click();
	}
	
	public void clickCreateNewTask()
	{
		CreateNewTask.click();
	}
	public void enterTaskName(String taskname)
	{
		EnterTaskName.sendKeys(taskname);
	}

	/*
	 * public void clickCreateTaskButton() { CreateTaskButton.click(); }
	 */
	public void createNewCustomer(String customerName, String customerDes)
	{
		AddNewButton.click();
		NewCustomer.click();
		EnterCustomerName.sendKeys(customerName);
		EnterCustomerDescription.sendKeys(customerDes);
		CreateCustomerButton.click();
		System.out.println(customerName+" Customer Created suceessfully");
	}
	public void createNewTask(String TaskName)
	{
		EnterTaskName.sendKeys(TaskName);
		
	}
	public void createNewProject(String projectName,String projectDes)
	{
		
		AddNewButton.click();
		NewProject.click();
		EnterProjectName.sendKeys(projectName);
	   // CustomerDropDown.click();
		EnterProjectDes.sendKeys(projectDes);
		
	//	EnterTaskNameP.sendKeys(taskName);
		CreateProjectButton.click();
		System.out.println("Without Selcting customer project should not created : Passed");
		
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
