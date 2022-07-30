package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideTermsConPage;
import reusable.BaseClass;

public class TandCStepDefnition extends BaseClass {
	TideTermsConPage terms;

	@When("i click on T and c")
	public void i_click_on_t_and_c() {

		closePopUp();

		terms = new TideTermsConPage();

		terms.clickOnTandC();
	}

	@Then("it should navigate to parent website")
	public void it_should_navigate_to_parent_website() {

		terms.switchTabs();
	}

	@Then("check the title")
	public void check_the_title() {

		String title = terms.getTilte();

		System.out.println(title);
		
		String key = excel.getDataByKey("Sheet1", "TestTen");

		if (title.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		logger.trace("Excuted sucessfully");
	}
}
