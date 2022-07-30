package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideLiquidPage;
import reusable.BaseClass;

public class LiquidProductStepDefnition extends BaseClass {

	TideLiquidPage liquid;

	@Given("i click on liquids product")
	public void i_click_on_liquids_product() {
		closePopUp();
		liquid = new TideLiquidPage();
		liquid.clickonShopProducts();
		liquid.clickonLiquidProduct();

	}

	@When("i click on first product")
	public void i_click_on_first_product() {

		liquid.clickOnClick();
	}

	@Then("check product contains Bleach")
	public void check_product_contains_bleach() {
		System.out.println(liquid.getResult());
	}

}
