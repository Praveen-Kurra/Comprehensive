package pageUi;

import org.openqa.selenium.By;

public class TideHomePageUi {

	public static By searchbar = By.cssSelector("input[name='q']");

	public static By shopProducts = By.cssSelector("a[href='/en-us/shop']");

	public static By howtowashcloths = By.cssSelector("a[href='/en-us/how-to-wash-clothes']");

	public static By Register = By.cssSelector(".login-register>a");

	public static By ourcommitment = By.cssSelector("a[href='/en-us/our-commitment']");

	public static By contactus = By.xpath("//a[text()='Contact Us']");

	public static By Browsebytype = By.xpath("//h4[text()='Browse by type']");

	public static By T_C = By.cssSelector("a[href='https://termsandconditions.pg.com/en-us/']");

	public static By Loadsofhopearticle = By.xpath("//p[text()='Loads of Hope']");

}
