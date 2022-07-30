package pageUi;

import org.openqa.selenium.By;

public class TideShopProductsUi {

	public static By Fabriccare = By.xpath("//span[text()='Fabric Care']");

	public static By Antibactirial = By.xpath("//strong[text()='Antibacterial']");

	public static By Retailers = By.xpath(
			"//strong[text()='Antibacterial']//ancestor::div[@class='product-preview-content-wrapper']//following-sibling::div[@role='button']");

	public static By price =By.cssSelector("span[class='ps-price']");
	
	public static By searchRetailers=By.xpath("//span[text()='Find Retailers']");
}
