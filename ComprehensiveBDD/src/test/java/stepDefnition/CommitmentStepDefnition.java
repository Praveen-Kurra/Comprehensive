package stepDefnition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideCommitmentPage;
import reusable.BaseClass;

public class CommitmentStepDefnition extends BaseClass{
	 TideCommitmentPage commit;
	
	@Given("i mouseHover on Commitment")
	public void i_mouse_hover_on_commitment() {
		
		closePopUp();
		
   commit=new TideCommitmentPage();
    
    commit.goToOurCommitment();

	}
	@When("i click on Our ambition")
	public void i_click_on_our_ambition() {
	    commit.clickOnOurAmbition();
		
	}
	@Then("it should navigates to page")
	public void it_should_navigates_to_page() {

	    String result=commit.getResults();
	    
		String key = excel.getDataByKey("Sheet1", "TestTwo");

		if (result.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");

		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}
	    
	    System.out.println(result);
	    
	    logger.trace("Excuted sucessfully");
	}

}
