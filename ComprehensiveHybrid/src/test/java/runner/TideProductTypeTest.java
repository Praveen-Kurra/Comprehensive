package runner;

import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideProductsTypePage;
import reusable.BaseClass;

public class TideProductTypeTest extends BaseClass {

	@Test
	public void productTest(Method method) {

		logger.trace(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");
		closePopUp();

		TideProductsTypePage product = new TideProductsTypePage();

		logger.info(product.getClass().getName() + "Created onject for this class");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1500)");

		product.clickOnBrowseByType();

		product.clickOnMechineCare();

		String result = product.getResults();

		System.out.println(result);

		String key = excel.getDataByKey("Sheet1", "TestEight");

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
