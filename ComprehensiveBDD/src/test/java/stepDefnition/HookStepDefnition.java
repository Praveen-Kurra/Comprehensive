package stepDefnition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import reusable.BaseClass;

public class HookStepDefnition extends BaseClass {

	@Before
	public void setUp() {

		openBrowser();
		
		logger.fatal("initializing the Browser");

	}

	@BeforeAll
	public static void before_() {

		initialize();
		
		logger.fatal("Initialising all the methods at a time");

	}

	@After
	public void afterHook(Scenario sce) {

		tearDown();
		
		logger.debug("Closing the browser");

	}

	@Given("i am on tide homePage")
	public void i_am_on_tide_home_page() {

		navigateToHomePage();
		
		logger.error("Causing null pointer while navigate to the homePage");
	}
}
