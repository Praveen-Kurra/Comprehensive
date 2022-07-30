package runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TideLiveChatPage;
import reusable.BaseClass;

public class TideLiveChatPageTest extends BaseClass{

	
	@Test
	public void chatWithSupport(Method method) {
		
		logger.trace(method.getName()+" ::" +"invoked ");
		
		test = reports.createTest(this.getClass().getName() + "::" + method.getName());
		
		test.assignAuthor("Praveen");
		
		closePopUp();
		
		TideLiveChatPage chat=new TideLiveChatPage();
		
		logger.info(chat.getClass().getName()+"created object for this class");
		
		chat.clickOnLiveChat();
		
		String result=chat.getTimings();
		
		System.out.println(result);
		
		String key = excel.getDataByKey("Sheet1", "TestFive");

		if (result.contains(key)) {

			Assert.assertTrue(true);

			logger.fatal("Assertion passes");
			
		} else {

			Assert.assertTrue(false);

			logger.debug("Assertion failed");
		}

		
		logger.debug(method.getName()+"::"+"excecuted sucessfully");
	}
}
