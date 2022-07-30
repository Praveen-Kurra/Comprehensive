package pageObjects;

import org.openqa.selenium.WebElement;

import pageUi.TideHomePageUi;
import pageUi.TideLiquidUi;
import reusable.Helper;

public class TideLiquidPage {
	Helper help=new Helper();
	
	public void clickonShopProducts() {
		
		WebElement ele=help.getWebelement(TideHomePageUi.shopProducts);
		
		help.mouseOver(ele);
	}

	public void clickOnClick() {
		help.click(TideLiquidUi.liquid);
	}
	public String getResult() {
	return	help.getText(TideLiquidUi.result);
	}
	
	public void clickonLiquidProduct() {
		help.click(TideLiquidUi.product);
	}
}
