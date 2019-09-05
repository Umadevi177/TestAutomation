package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoHomePage {
	public WebDriver driver;
	public AutoHomePage(WebDriver sdriver) {
		// TODO Auto-generated constructor stub
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="header_logo")
	private WebElement logo;
	
	@FindBy(className="login")
	private WebElement siginbtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSiginbtn() {
		return siginbtn;
	
	}
	public WebElement getLogo() {
		return logo;
	}

}
