package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideSearchPage;
import reusable.BaseClass;

public class TideSearchFunctionTest extends BaseClass {

	@Test
	public void productSearch(Method method) {

		logger.trace(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");

		closePopUp();

		TideSearchPage search = new TideSearchPage();

		logger.info(search.getClass().getName() + "Method was invoking ");

		search.clickSearchIcon();

		search.enterTextInSearchBox("Detergent");
		
		search.clickProducts();

		search.clickSearchProduct();

		String result = search.getInstructions();

		System.out.println(result);

		String key = excel.getDataByKey("Sheet1", "TestNine");

		if (result.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");

		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		logger.fatal(method.getName() + "::" + "excecuted sucessfully");

	}

}
