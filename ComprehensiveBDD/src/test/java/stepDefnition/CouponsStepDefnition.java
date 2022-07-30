package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideCoupnAndRewadPage;
import reusable.BaseClass;

public class CouponsStepDefnition extends BaseClass {
	TideCoupnAndRewadPage cupn;
	
	@Given("i click on coupons and rewards")
	public void i_click_on_coupons_and_rewards() {
	closePopUp();
		
    cupn=new TideCoupnAndRewadPage();
		
	cupn.clickOnCandR();
	}
	@When("i click on save Button")
	public void i_click_on_save_button() {
		cupn.clickSaveButton();
		
	}
	@Then("it go to Parennt Page")
	public void it_go_to_parennt_page() {
		
		cupn.switchTabs();
		
		String title=cupn.getTitle();
		

		String key = excel.getDataByKey("Sheet1", "TestThree");

		if (title.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		System.out.println(title);
		
		logger.trace("Excuted sucessfully");
	}


}
