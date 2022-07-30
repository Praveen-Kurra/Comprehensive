package pageObjects;

import pageUi.TideHomePageUi;
import pageUi.TidearticlesUi;
import reusable.Helper;

public class TideArticlePage {

	Helper help=new Helper();
	
	public void clickOnLoadsArticle() {
		
		help.click(TideHomePageUi.Loadsofhopearticle);
	}
	public String getArticle() {
		
		return help.getText(TidearticlesUi.article);
	}
}
