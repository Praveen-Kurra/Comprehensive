package pageObjects;

import pageUi.TideNewLaunchesUi;
import reusable.BaseClass;
import reusable.Helper;

public class TideNewLaunchesPage extends BaseClass {

	Helper help = new Helper();

	public void clickonWhatsNew() {
		help.click(TideNewLaunchesUi.whatsNew);
	}

	public String getResult() {
		return help.getText(TideNewLaunchesUi.spaceLoca);
	}
}
