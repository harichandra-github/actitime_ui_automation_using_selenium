package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeTrackPage {
	
	@FindBy(xpath="//a[contains(text(),'Enter Time-Track')]")
	public WebElement EnterTimeTrack;
    @FindBy(xpath="//a[normalize-space()='View Time-Track']")
    public WebElement ViewTimeTrack;
    @FindBy(xpath="//a[contains(text(),'Lock Time-Track')]")
    public WebElement LockTimeTrack;
    @FindBy(xpath="//a[contains(text(),'Approve Time-Track')]")
    public WebElement ApproveTimeTrack;
    @FindBy(xpath="//button[@id='ext-gen23']")
    public WebElement Calendar;
    @FindBy(xpath="//body[1]/div[16]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    public WebElement NotReady;
    @FindBy(xpath="//body[1]/div[16]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    public WebElement ReadyforApproval;
    @FindBy(xpath="//div[@id='addTaskButtonId']")
    public WebElement NewButton;
    @FindBy(xpath="//input[@id='taskSearchControl_field']")
    public WebElement Searchbox;
    @FindBy(xpath="//span[contains(text(),'Add Recent Task')]")
    public WebElement AddRecentTask;
    @FindBy(xpath="//span[contains(text(),'Add Tasks from the List')]")
    public WebElement AddTaskFromTheList;
    @FindBy(xpath="//div[@id='FormModifiedDivButton']")
    public WebElement SaveButton;
    @FindBy(xpath="//body[1]/div[16]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/span[2]")
    public WebElement CancelButton;
    @FindBy(xpath="//input[@id='SubmitTTButton']")
    public WebElement SaveChanges;
    @FindBy(xpath="//body[1]/div[16]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[3]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/span[2]")
    public WebElement CancelButton2;
    @FindBy (xpath="//tbody/tr[@id='taskRow135']/td[@id='taskNameCell135']/div[1]/div[2]/div[1]/div[1]/div[1]")
    public WebElement CallsTask;
    @FindBy(xpath="//div[contains(text(),'- Select Customer -')]")
	public WebElement selectCustomer;
    @FindBy(xpath="//div[contains(text(),'- Select Customer -')]")
	/*
	 * public WebElement selectCustomer;
	 * 
	 * @FindBy(xpath="//div[@class='searchItemList']")
	 */
	public WebElement searchitem;
	@FindBy(xpath="//div[contains(text(),'- New Customer -')]")
	public WebElement NewCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	public WebElement EnterCustomerName;
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	public WebElement EnterProjectName;
    @FindBy(xpath="/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
    public WebElement EnterTaskName;
    @FindBy(xpath="//div[contains(text(),'Create Tasks')]")
	public WebElement CreateTaskButton;
    @FindBy(xpath="//div[@class='comboboxButton focused']//div[@class='dropdownButton']")
    public WebElement DropDown;
    
    
    public TimeTrackPage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    
    
    public void clickCallsTask()
    {
    	CallsTask.click();
    }
    public void clickEnterTimeTrack()
    {
    	EnterTimeTrack.click();
    }
    public void clickViewTimeTrack()
    {
    	ViewTimeTrack.click();
    }
    public void clickLockTimeTrack()
    {
    	LockTimeTrack.click();
    }
    public void clickApproveTimeTrack()
    {
    	ApproveTimeTrack.click();
    }
    public void clickCalendar()
    {
    	Calendar.click();
    }
    public void clickNotReady()
    {
    	NotReady.click();
    }
    public void clickReadyforApproval()
    {
    	ReadyforApproval.click();
    }
    public void clickNewButton()
    {
    	NewButton.click();
    }
    public void searchTask(String str)
    {
    	Searchbox.sendKeys(str,Keys.ENTER);
    }
    public void clickAddRecentTask()
    {
    	AddRecentTask.click();
    }public void clickAddTaskFromTheList()
    {
    	AddTaskFromTheList.click();
    }public void clickSaveButton()
    {
    	SaveButton.click();
    }public void clickCancelButton2()
    {
    	CancelButton2.click();
    }
    public void createNewTask(String taskName, WebDriver driver)
	{    
		/* String customerName, String projectName,
		 * WebDriverWait ww=new WebDriverWait(driver, 20);
		 * 
		 * ww.until(ExpectedConditions.elementToBeClickable(DropDown));
		 * DropDown.click(); //selectCustomer.click(); //searchitem.click();
		 * NewCustomer.click(); EnterCustomerName.sendKeys(customerName);
		 * EnterProjectName.sendKeys(projectName);
		 */
		EnterTaskName.sendKeys(taskName);
		CreateTaskButton.click();
		//System.out.print("Task is displayed : ");
		//System.out.println(driver.findElement(By.linkText(taskName)).isDisplayed());
		System.out.println("Task Added successfully");
	}
	
}
