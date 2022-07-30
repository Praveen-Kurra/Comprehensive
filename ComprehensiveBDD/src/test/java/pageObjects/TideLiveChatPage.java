package pageObjects;

import pageUi.TideLiveChatUi;
import reusable.Helper;

public class TideLiveChatPage {

	Helper help=new Helper();
	
	public void clickOnLiveChat() {
		
		help.click(TideLiveChatUi.liveChat);
	}
	public String getTimings() { 
		
		return help.getText(TideLiveChatUi.timings);
	}
}
