package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	@FindBy (xpath="//div[normalize-space()='Monthly Internal Costs Report']")
	public WebElement MonthlyReport;
	@FindBy(xpath="//div[normalize-space()=\"Chart: Past Month's Leaves\"]")
	public WebElement PastMonthLeaveReport;
    @FindBy(xpath="//div[@id='ext-gen134']")
    public WebElement CreateChartButton;
	@FindBy(xpath="//span[@id='PIE_CHART']")
	public WebElement PieChart;
	@FindBy(xpath="//span[normalize-space()='Export to PDF']")
	public WebElement ExportToPDFButton;
	@FindBy(xpath="//span[contains(text(),'Download PDF')]")
	public WebElement DownloadPDFButton;
	
	
	
	
	
	
	
	public ReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

	public void viewMonthlyReport()
	{
		MonthlyReport.click();
		  System.out.println("Monthly Report displayed successfully");
	}
	public void viewPastMonthLeaveReport()
	{
		PastMonthLeaveReport.click();
		  System.out.println("Past Months Leave Report displayed successfully");
	}
	public void  createPieChart() throws Exception
	{
		CreateChartButton.click();
		PieChart.click();
        System.out.println("Chart Created successfully");
		ExportToPDFButton.click();
		
			Thread.sleep(10);

		DownloadPDFButton.click();
	  //  System.out.println("Chart Download successfully");
	}
}
