package pageObjects;

import pageUi.TideHomePageUi;
import pageUi.TideProductsTypeUI;
import reusable.Helper;

public class TideProductsTypePage {

	Helper help=new Helper();
	
	public void clickOnBrowseByType() {
		
		help.click(TideHomePageUi.Browsebytype);
	}
	
	public void clickOnMechineCare() {
		
		help.waitUntilClickable(TideProductsTypeUI.Mechinecare);
		
		help.click(TideProductsTypeUI.Mechinecare);
	}
	 public String getResults() { 
		
		 help.waitUntilVisible(TideProductsTypeUI.product);
		
		return help.getText(TideProductsTypeUI.product);
	 }
}
