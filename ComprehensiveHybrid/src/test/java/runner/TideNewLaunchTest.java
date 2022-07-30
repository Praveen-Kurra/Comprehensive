package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideNewLaunchesPage;
import reusable.BaseClass;

public class TideNewLaunchTest extends BaseClass {

	@Test
	public void newLaunch(Method method) {

		logger.fatal(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");
		closePopUp();

		TideNewLaunchesPage newItem = new TideNewLaunchesPage();

		logger.info(newItem.getClass().getName() + "created object for this class");

		newItem.clickonWhatsNew();

		String result = newItem.getResult();

		System.out.println(result);

		String key = excel.getDataByKey("Sheet1", "TestSix");

		if (result.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");

		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		logger.trace(method.getName() + "::" + "excecuted sucessfully");

	}
}
