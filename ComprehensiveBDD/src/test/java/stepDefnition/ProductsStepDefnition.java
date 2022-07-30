package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideShopProductsPage;
import reusable.BaseClass;

public class ProductsStepDefnition extends BaseClass {
	TideShopProductsPage products;

	@Given("i mouseHover on products")
	public void i_mouse_hover_on_products() {
		closePopUp();

		products = new TideShopProductsPage();

		products.goToShopProducts();

	}

	@When("i click on fabric care")
	public void i_click_on_fabric_care() {

		products.clickFabriccare();
	}

	@When("i click on antifabric spray")
	public void i_click_on_antifabric_spray() {
		products.clickAntifabricSpray();
	}

	@Then("i click on retailers")
	public void i_click_on_retailers() {
		products.clickRetailersAt();
	}

	@Then("it should price")
	public void it_should_price() {
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

		logger.trace("Excuted sucessfully");
	}

}
