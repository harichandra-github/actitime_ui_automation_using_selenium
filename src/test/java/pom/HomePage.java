package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="Switch to actiPLANS")
	public WebElement Switch_to_actiPlans;
	
	@FindBy(xpath="//div[@id='container_tt']")
	public WebElement TimeTrack;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	public WebElement Tasks; 

    @FindBy(xpath="//div[@id='container_reports']")
    public WebElement Reports;

    @FindBy(xpath="//div[@id='container_users']")
    public WebElement Users;


   @FindBy(xpath="//span[contains(text(),'Create Chart')]")
   public WebElement CreateChart;

   @FindBy(xpath="//span[normalize-space()='New Report']")
   public WebElement NewReport;
   @FindBy(xpath="//div[@id='ext-gen30']")
   public WebElement Dropdown;

   @FindBy(xpath="//a[@class='userProfileLink username ']")
   public WebElement Myprofile;
   
   public HomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   public void clickSwitch_to_actiPlans()
   {
	   Switch_to_actiPlans.click();
   }
   public void clickTimeTrack()
   {
	   TimeTrack.click();
   }
   public void clickTasks()
   {
	   Tasks.click();
   }
   public void clickReports()
   {
	   Reports.click();
   }
   public void clickUsers()
   {
	   Users.click();
   }
   public void clickCreateChart()
   {
	   CreateChart.click();
   }
   public void clickNewReport()
   {
	   NewReport.click();
   }
   public void clickDropdown()
   {
	   Dropdown.click();
   }
   public void clickMyprofile()
   {
	   Myprofile.click();
   }
   public void sectionsVisible()
   {
	   System.out.println();		
	    System.out.print("TimeTrack Section is visible :");
		System.out.println(TimeTrack.isDisplayed());
		System.out.println();
		System.out.print("Tasks Section is visible :");
		System.out.println(Tasks.isDisplayed());
		System.out.println();
		System.out.print("Reports Section is visible :");
		System.out.println(Reports.isDisplayed());
		System.out.println();
		System.out.print("Users Section is visible :");
		System.out.println(Users.isDisplayed());		
		System.out.println();
	   
   }
}
