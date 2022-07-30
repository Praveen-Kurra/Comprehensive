package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideCommitmentPage;
import reusable.BaseClass;

public class TideCommitmentTest extends BaseClass {

	@Test
	public void commitment(Method method) {

		logger.trace(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");

		closePopUp();

		TideCommitmentPage commit = new TideCommitmentPage();

		logger.fatal("Object was created ");

		commit.goToOurCommitment();

		commit.clickOnOurAmbition();

		String result = commit.getResults();

		System.out.println(result);

		String key = excel.getDataByKey("Sheet1", "TestTwo");

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
