package reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilities.FinalVariables;



/**
 * @author M1088236
 *
 */
public class Browser {	

	/**
	 * 
	 * @param driver
	 * @param browserName
	 * @param Url
	 * @return the driver whichever name is passed
	 */
	public static WebDriver startBrwser(WebDriver driver, String browserName,String url) {


		if (browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");

			driver=new EdgeDriver();
			

		} else {
			
			System.out.println("Sorry this browser Doesnt support");
		}

		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(FinalVariables.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}
	
}
