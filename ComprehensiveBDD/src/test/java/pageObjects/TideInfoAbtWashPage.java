package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageUi.TideHomePageUi;
import pageUi.TideInoAbtWashUi;
import reusable.Helper;

public class TideInfoAbtWashPage {

	Helper help=new Helper();

	public void goToHowToWash() {
		
	WebElement ele=	 help.getWebelement(TideHomePageUi.howtowashcloths);
	
	help.mouseOver(ele);
	}
	
	public void clickOnRemoveStains() {	
		
		help.click(TideInoAbtWashUi.removeStains);
	}
	public void clickOnEggStatins() {
		
		help.click(TideInoAbtWashUi.egg);
	}
	public String getResult() {
		
		help.waitUntilVisible(TideInoAbtWashUi.removeeggstain);
		
		return help.getText(TideInoAbtWashUi.removeeggstain);
		
	}
}
