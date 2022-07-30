package pageObjects;

import pageUi.TideHomePageUi;
import reusable.Helper;

public class TideTermsConPage {

	Helper help=new Helper();
	
	public void clickOnTandC() {
		help.click(TideHomePageUi.T_C);
	}
	public void switchTabs() {
		
		String child=help.getChildWindow();
		
		help.switchToChildWindow(child);
	}
	public String getTilte() {
		
	 return	help.getTitle();
	}
}
