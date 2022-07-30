package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideCommitmentPage;
import pageObjects.TideCoupnAndRewadPage;
import reusable.BaseClass;

public class TideCoupnAndrRewardTest extends BaseClass{

	@Test
	public void rewadsTest(Method method) {
		
		logger.fatal(method.getName()+" ::" +"invoked ");
		
		test = reports.createTest(this.getClass().getName() + "::" + method.getName());
		
		test.assignAuthor("Praveen");
		
		closePopUp();
		
		TideCoupnAndRewadPage cupn=new TideCoupnAndRewadPage();
		
		logger.info(cupn.getClass().getName()+" created object for this class");
		
		cupn.clickOnCandR();
		
		cupn.clickSaveButton();
		
		cupn.switchTabs();
		
		String title=cupn.getTitle();
		
		System.out.println(title);
		

		String key = excel.getDataByKey("Sheet1", "TestThree");

		if (title.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		logger.fatal(method.getName()+"::"+"excecuted sucessfully");
	}
}
