package stepDefnition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideInfoAbtWashPage;
import reusable.BaseClass;

public class InformationStepDefnition extends BaseClass{
	TideInfoAbtWashPage stains;

	@Given("i mouseHoever on How to wash")
	public void i_mouse_hoever_on_how_to_wash() {

	closePopUp();
		
	stains=new TideInfoAbtWashPage();
		
		stains.goToHowToWash();
		
	}
	@When("i click on Remove Statins")
	public void i_click_on_remove_statins() {

		stains.clickOnRemoveStains();
	}
	@Then("i click Egg Statins")
	public void i_click_egg_statins() {

		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,2500)");
			
	stains.clickOnEggStatins();
	}
	@Then("it display information")
	public void it_display_information() {
	
	String result=stains.getResult();
		
		System.out.println(result);
		
		String key = excel.getDataByKey("Sheet1", "TestFour");

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
