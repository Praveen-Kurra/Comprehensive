package pageObjects;


import org.openqa.selenium.WebElement;

import pageUi.TideCommitmentUi;
import pageUi.TideHomePageUi;
import reusable.Helper;

public class TideCommitmentPage {
	
Helper help=new Helper();

public void goToOurCommitment() {
	
	WebElement ele= help.getWebelement(TideHomePageUi.ourcommitment);
	
	help.mouseOver(ele);
}

public void clickOnOurAmbition() {
	
	help.click(TideCommitmentUi.ourambition);
}

public String getResults() {
	
	return help.getText(TideCommitmentUi.result);
}
}
