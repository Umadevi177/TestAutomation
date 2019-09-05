package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoLoginPage {
	public WebDriver driver;
	public  AutoLoginPage(WebDriver adriver) {
		// TODO Auto-generated constructor stub
		this.driver= adriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement signin;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	
}