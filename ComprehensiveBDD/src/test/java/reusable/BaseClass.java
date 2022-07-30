package reusable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigData;
import utilities.ExcelData;


public class BaseClass {
	public static WebDriver driver;
	public static ConfigData prop;
	public static ExcelData excel;
	
	public static Logger logger=LogManager.getLogger(BaseClass.class);
	
	public static void initialize() {

		prop = new ConfigData();

		excel=new ExcelData();
		
		logger.trace("All methods are initialising ");
		
	}

	public void openBrowser() {
		
		String BrowserName = prop.getData("Browser");
		
		String Url = prop.getData("Url");

		driver = Browser.startBrwser(driver, BrowserName);
		
		logger.warn("Driver invoked ");
	}
	
	public void tearDown() {

		Browser.quitBrowser(driver);
		
		logger.warn("Driver Closed ");
		
	}
	
	public void navigateToHomePage() {
		
		String Url = prop.getData("Url");
		
		driver.get(Url);
		
		logger.fatal("Navigating to that url");
	}
	
	public void closePopUp() {
		try {

			WebDriverWait wiat = new WebDriverWait(driver, 15);

			wiat.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@class='lilo3746-iframe']")));

			driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();
			
			logger.fatal("Training to close popUp");

		} catch (Exception e) {

			System.out.println("There is no pop up");
			
			logger.debug("unable to close PopUp");
		}

	}
}
