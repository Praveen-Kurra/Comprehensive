package pageObjects;

import pageUi.TideCoupsAndRewardUI;
import reusable.Helper;

public class TideCoupnAndRewadPage {

	Helper help=new Helper();
	
	public void clickOnCandR() {
		help.click(TideCoupsAndRewardUI.cAndR);
	}
	
	public void clickSaveButton() {
		help.click(TideCoupsAndRewardUI.saveButton);
	}
	public void switchTabs() {
		
	String child=help.getChildWindow();
	
	help.switchToChildWindow(child);
	}
	
	public String getTitle() {
		
	return	help.getTitle();
	}
}
