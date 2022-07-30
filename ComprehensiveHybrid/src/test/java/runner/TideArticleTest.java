package runner;

import java.lang.reflect.Method;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideArticlePage;
import reusable.BaseClass;

public class TideArticleTest extends BaseClass {

	@Test
	public void article(Method method) {

		logger.info(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");

		closePopUp();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,3000)");

		logger.fatal("Scrolling down the window");

		TideArticlePage art = new TideArticlePage();

		art.clickOnLoadsArticle();

		String result = art.getArticle();

		String key = excel.getDataByKey("Sheet1", "TestOne");

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
