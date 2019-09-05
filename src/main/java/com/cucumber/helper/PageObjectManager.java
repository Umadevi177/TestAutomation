package com.cucumber.helper;

import org.openqa.selenium.WebDriver;
import com.cucumber.pom.AutoHomePage;
import com.cucumber.pom.AutoLoginPage;
import com.cucumber.pom.AutoOrderPage;

public class PageObjectManager {
	public WebDriver driver;
	public PageObjectManager(WebDriver ldriver) {
	this.driver=ldriver;
}
	private AutoHomePage ah;
	private AutoLoginPage lg;
	private AutoOrderPage ao;
	
	public AutoHomePage getAh() {
		if(ah==null) {
			ah=new AutoHomePage(driver);
		}
		return ah;
	}
	public AutoLoginPage getLg() {
		if (lg==null) {
			lg=new AutoLoginPage(driver);
			
		}
		return lg;
	}
	public AutoOrderPage getAo() {
		if(ao==null) {
			ao=new AutoOrderPage(driver);
		}
		return ao;
	}
	
}

