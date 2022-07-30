package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideShopProductsPage;
import reusable.BaseClass;

public class TideProductsPageTest extends BaseClass {

	@Test
	public void productsTest(Method method) {

		logger.trace(method.getName() + " ::" + "invoked ");

		test = reports.createTest(this.getClass().getName() + "::" + method.getName());

		test.assignAuthor("Praveen");

		closePopUp();

		TideShopProductsPage products = new TideShopProductsPage();

		logger.info(products.getClass().getName() + "created object for this class");

		products.goToShopProducts();

		products.clickFabriccare();

		products.clickAntifabricSpray();

		products.clickRetailersAt();

		String price = products.getPrice();

		System.out.println(price);

		String key = excel.getDataByKey("Sheet1", "TestSeven");

		if (price.contains(key.substring(6))) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");

		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		logger.trace(method.getName() + "::" + "excecuted sucessfully");

	}
}
