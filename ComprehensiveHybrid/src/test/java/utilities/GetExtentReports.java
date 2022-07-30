package utilities;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import reusable.GetDate;

/**
 * @author M1088236
 * This is a customized extent report class
 * This class uses spark report
 *
 */
public class GetExtentReports {

	public ExtentReports reports;

	public ExtentSparkReporter spark;

	public GetExtentReports() {

		File fis = new File("./ExtentReports/" + GetDate.getDatetimeFormat() + ".html");

		reports = new ExtentReports();

		spark = new ExtentSparkReporter(fis);

		spark.config().setDocumentTitle("Mindtree");
		
		reports.attachReporter(spark);

	}

	/**
	 * @param driver This method actually add the system capabilities to the extent
	 *               report
	 */
	/**
	 * @param driver
	 */
	public void addSystemConfiguration(WebDriver driver) {
		
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();

		reports.setSystemInfo("Browser Name", capabilities.getBrowserName());
		
		reports.setSystemInfo("Browser Version", capabilities.getVersion());
		
		reports.setSystemInfo("OS", System.getProperty("os.name"));
		
		reports.setSystemInfo("Java Version", System.getProperty("java.version"));

	}

}
