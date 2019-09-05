package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoOrderPage {
	public WebDriver driver;
	
	public AutoOrderPage(WebDriver bdriver ) {
		// TODO Auto-generated constructor stub
		this.driver= bdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="sf-with-ul")
	private WebElement mouseHoverwomen;
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement moveTotshirt;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']")
	private WebElement checkBox;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;
	@FindBy(xpath="//a[@class='button lnk_view btn btn-default']")
	private WebElement clickMore;
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement cartClick;
	@FindBy(xpath="//div [@class='layer_cart_cart col-xs-12 col-md-6']")
	private WebElement FrameClick;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceedToclick;
	@FindBy(xpath="//a [@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedTocheck;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement   proceedTocheck2;
	@FindBy(xpath="//div[@id='uniform-cgv']")
	private WebElement  checkAgree;
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement  proceedTocheck3 ;
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement pay;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	@FindBy(xpath="//div[@class='header_user_info']//span")
	private WebElement username;
	@FindBy(xpath="//h1[text()='Faded Short Sleeve T-shirts']")
	private WebElement checkfaded;
	@FindBy(xpath="//strong[text()='Quantity']")
	private WebElement quantity;
	
	

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPay() {
		return pay;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getCheckfaded() {
		return checkfaded;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMouseHoverwomen() {
		return mouseHoverwomen;
	}
	public WebElement getMoveTotshirt() {
		return moveTotshirt;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getImage() {
		return image;
	}
	public WebElement getClickMore() {
		return clickMore;
	}
	public WebElement getCartClick() {
		return cartClick;
	}
	public WebElement getFrameClick() {
		return FrameClick;
	}
	public WebElement getProceedToclick() {
		return proceedToclick;
	}
	public WebElement getProceedTocheck() {
		return proceedTocheck;
	}
	public WebElement getProceedTocheck2() {
		return proceedTocheck2;
	}
	public WebElement getCheckAgree() {
		return checkAgree;
	}
	public WebElement getProceedTocheck3() {
		return proceedTocheck3;
	}
	
	
	
}
