package reusable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ConfigData;
import utilities.ExcelData;
import utilities.GetExtentReports;
import utilities.Screenshots;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ConfigData prop;
	public static ExcelData excel;
	public GetExtentReports exReports;
	public static Logger logger=LogManager.getLogger(BaseClass.class);

	@BeforeSuite
	public void initialize() {

		logger.info("Initilize Method invoked @Before Suite");
		
		exReports = new GetExtentReports();
		reports = exReports.reports;
		prop = new ConfigData();
		 excel=new ExcelData();

	}

	@BeforeClass
	public void openBrowser() {
		logger.info("Browser Invoked @Before Suite");
		
		String BrowserName = prop.getData("Browser");
		String Url = prop.getData("Url");

		driver = Browser.startBrwser(driver, BrowserName, Url);
	}
	
	@AfterMethod
	public void validateTests(ITestResult result) {
		
		logger.info("Validtaing the Test @Before Suite");
		if(result.getStatus()==ITestResult.SUCCESS) {
			
			test.pass("Passes").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			
			logger.info("Validation suceesfully passes");		
		}
		else if(result.getStatus()==ITestResult.FAILURE){
			
		test.fail("Test case Failed").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
		
		logger.warn("Validation failed");
		}
		
		
		
	}
	
	

	@AfterClass
	public void tearDown() {

		Browser.quitBrowser(driver);
		
		logger.info("Browser closed");
	}

	@AfterSuite
	public void quit() {

		exReports.addSystemConfiguration(driver);
		
		reports.flush();
		
		logger.info("All done @after suite");
	}

	public void closePopUp() {
		try {

			WebDriverWait wiat = new WebDriverWait(driver, 15);

			wiat.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@class='lilo3746-iframe']")));

			driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();

		} catch (Exception e) {

			System.out.println("There is no pop up");
		}

	}
}
