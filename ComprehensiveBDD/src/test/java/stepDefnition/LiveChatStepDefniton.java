package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideLiveChatPage;
import reusable.BaseClass;

public class LiveChatStepDefniton extends BaseClass {
	TideLiveChatPage chat;

	@When("i click on live Chat")
	public void i_click_on_live_chat() {
		closePopUp();

		chat = new TideLiveChatPage();

		chat.clickOnLiveChat();
	}

	@Then("it should displayes timinigs")
	public void it_should_displayes_timinigs() {

		String result = chat.getTimings();

		System.out.println(result);
		
		String key = excel.getDataByKey("Sheet1", "TestFive");

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
