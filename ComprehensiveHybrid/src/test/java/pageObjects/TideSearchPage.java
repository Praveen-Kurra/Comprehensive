package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageUi.TideHomePageUi;
import pageUi.TideSearchUi;
import reusable.Helper;

public class TideSearchPage {

	WebDriver driver;

	Helper help = new Helper();
	


	public void clickSearchIcon() {
		help.click(TideHomePageUi.searchbar);

		
	}

	public void enterTextInSearchBox(String text) {
		help.enterText(TideHomePageUi.searchbar, text);

	}

	public void clickSearchProduct() {
		
		help.waitUntilClickable(TideSearchUi.searchProduct);
		
		help.click(TideSearchUi.searchProduct);
		
	}

	public String getInstructions() {
		
		return help.getText(TideSearchUi.instructions);

	}
	
	public void clickProducts() {
		help.click(TideSearchUi.productsList);
	}
}
