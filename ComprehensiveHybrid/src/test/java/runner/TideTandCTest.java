package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideTermsConPage;
import reusable.BaseClass;

public class TideTandCTest extends BaseClass{

	
	@Test
	public void termsCon(Method method) {
		
		logger.trace(method.getName()+" ::" +"invoked ");
		
		test = reports.createTest(this.getClass().getName() + "::" + method.getName());
		
		test.assignAuthor("Praveen");
		
		closePopUp();
		
		TideTermsConPage terms=new TideTermsConPage();
		
		terms.clickOnTandC();
		
		terms.switchTabs();
		
		String title=terms.getTilte();
		
		System.out.println(title);
		

		String key = excel.getDataByKey("Sheet1", "TestTen");

		if (title.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		logger.debug(method.getName()+"::"+"excecuted sucessfully");
	}
}
