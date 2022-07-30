package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideSearchPage;
import reusable.BaseClass;

public class SearchStepDefnition extends BaseClass {

	TideSearchPage search;

	@Given("i click on search Icon")
	public void i_click_on_search_icon() {

		closePopUp();

		search = new TideSearchPage();

		search.clickSearchIcon();
	}

	@When("i enter {string}")
	public void i_enter(String string) {

		search.enterTextInSearchBox(string);

	}

	@When("i click on first Product")
	public void i_click_on_first_product() {
		search.clickSearchProduct();
	}

	@Then("it should display product instructions")
	public void it_should_display_product_instructions() {
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
		
		logger.trace("Excuted sucessfully");
	}

}
