package stepDefnition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideProductsTypePage;
import reusable.BaseClass;

public class CustomProductStepDefnition extends BaseClass {
	TideProductsTypePage product;

	@Given("i scrollDown Window")
	public void i_scroll_down_window() {

		closePopUp();
		product = new TideProductsTypePage();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1500)");
	}

	@When("i click on Browse By type")
	public void i_click_on_browse_by_type() {

		product.clickOnBrowseByType();
	}

	@When("i click on mechine care")
	public void i_click_on_mechine_care() {

		product.clickOnMechineCare();
	}

	@Then("it displayes products")
	public void it_displayes_products() {

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

		logger.trace("Excuted sucessfully");
	}

}
