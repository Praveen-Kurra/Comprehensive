package pageUi;

import org.openqa.selenium.By;

public class TideSearchUi {

	
	public static By searchProduct=By.xpath("//strong[text()='Clean Breeze']");
	
	public static By instructions=By.xpath("//strong[text()='Usage Instructions']//parent::p//following-sibling::ul");
	
	public static By productsList=By.cssSelector("button[class='active-tab']");
	
}
