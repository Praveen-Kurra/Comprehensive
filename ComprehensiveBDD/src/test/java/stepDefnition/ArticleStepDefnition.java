package stepDefnition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TideArticlePage;
import reusable.BaseClass;

public class ArticleStepDefnition extends BaseClass{
	TideArticlePage art;

	@And("i scroll down window")
	public void i_scroll_down_window() {
		
     closePopUp();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,3000)");
		
		logger.trace("calling the method");

	}
	@When("i click on loards of love article")
	public void i_click_on_loards_of_love_article() {
	 art=new TideArticlePage();
		
		art.clickOnLoadsArticle();
		
	}
	@Then("it should navagates article page")
	public void it_should_navagates_article_page() {
	
		String result = art.getArticle();

		String key = excel.getDataByKey("Sheet1", "TestOne");

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
