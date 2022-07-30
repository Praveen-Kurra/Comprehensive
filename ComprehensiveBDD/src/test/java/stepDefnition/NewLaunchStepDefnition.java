package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideNewLaunchesPage;
import reusable.BaseClass;

public class NewLaunchStepDefnition extends BaseClass {
	TideNewLaunchesPage newItem;
	
	@When("i click on whats new")
	public void i_click_on_whats_new() {
		closePopUp();
		
	 newItem=new TideNewLaunchesPage();
	
	newItem.clickonWhatsNew();
		
	}
	@Then("it should display new Launches")
	public void it_should_display_new_launches() {
	
		String result=newItem.getResult();
		
		System.out.println(result);
		

		String key = excel.getDataByKey("Sheet1", "TestSix");

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
