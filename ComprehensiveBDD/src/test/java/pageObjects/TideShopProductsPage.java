package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bind.annotation.Super;
import pageUi.TideHomePageUi;

import pageUi.TideShopProductsUi;
import reusable.Helper;

public class TideShopProductsPage {
	Helper help = new Helper();


	public TideShopProductsPage() {
       super();
		 
	}

	public void goToShopProducts() {

		WebElement products = help.getWebelement(TideHomePageUi.shopProducts);

		help.mouseOver(products);
	}

	public void clickFabriccare() {
		
       help.click(TideShopProductsUi.Fabriccare);
	}

	public void clickAntifabricSpray() {
		
		help.waitUntilClickable(TideShopProductsUi.Antibactirial);
		
		help.click(TideShopProductsUi.Antibactirial);
		
	}
	
public void clickRetailers() {
	
	help.waitUntilClickable(TideShopProductsUi.Retailers);
	
	help.click(TideShopProductsUi.Retailers);
	
}
	public String getPrice() {
		
		help.waitUntilVisible(TideShopProductsUi.price);
		
	  return	help.getText(TideShopProductsUi.price);
		
	}
	
	public void clickRetailersAt() {
		help.waitUntilClickable(TideShopProductsUi.searchRetailers);
		
		help.click(TideShopProductsUi.searchRetailers);
		
	}
}
