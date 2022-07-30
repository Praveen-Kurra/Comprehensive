package reusable;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends BaseClass {

	Actions action = new Actions(driver);

	WebDriverWait wait = new WebDriverWait(driver, 20);

	public void click(By element) {

		try {
			driver.findElement(element).click();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void enterText(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text, Keys.ENTER);
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public String getText(By element) {
		try {
			return driver.findElement(element).getText();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "";
	}

	public void mouseOver(WebElement element) {
		try {
			action.moveToElement(element).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public WebElement getWebelement(By element) {
		try {
			return driver.findElement(element);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return getWebelement(element);
	}

	public void waitUntilClickable(By ele) {
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	public void waitUntilVisible(By ele) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	}
	
	public String getChildWindow() {
		Set<String>handles=driver.getWindowHandles();

		Iterator<String> window=handles.iterator();
		
		  String parent=window.next();
		  
		  String Child=window.next();
		  
		  return Child;
	}
	
	public void switchToChildWindow(String child) {
		
		driver.switchTo().window(child);
	}
	public String getTitle() {
		return driver.getTitle();
	}
}
