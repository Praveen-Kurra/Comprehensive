package runner;

import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideInfoAbtWashPage;
import reusable.BaseClass;

public class TideInoWashPageTest extends BaseClass {

	
	@Test
	public void RemoveStains(Method method)  {
		
		logger.trace(method.getName()+" ::" +"invoked ");
		
		test = reports.createTest(this.getClass().getName() + "::" + method.getName());
		
		test.assignAuthor("Praveen");
		
		closePopUp();
		
		TideInfoAbtWashPage stains=new TideInfoAbtWashPage();
		
		logger.info(stains.getClass().getName()+" Was invoking the method");
		
		stains.goToHowToWash();
		
		stains.clickOnRemoveStains();
			
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,2500)");
				
		stains.clickOnEggStatins();
				
		String result=stains.getResult();
		
		System.out.println(result);

		String key = excel.getDataByKey("Sheet1", "TestFour");

		if (result.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		logger.fatal(method.getName()+"::"+"excecuted sucessfully");
	}
}
