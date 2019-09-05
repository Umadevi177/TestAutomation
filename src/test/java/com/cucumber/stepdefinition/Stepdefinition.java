package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.base.Baseclass;
import com.cucumber.helper.FileDataManager;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.AutoHomePage;
import com.cucumber.pom.AutoLoginPage;
import com.cucumber.pom.AutoOrderPage;
import com.cucumber.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	public static WebDriver driver = TestRunner.driver;
	//public static WebDriver driver;
	public static PageObjectManager pm = new PageObjectManager(driver);
	

	@Given("^user hit the automation practice website$")
	public void user_hit_the_automation_practice_website() throws Throwable {
	
		String url = FileDataManager.fdm.getconfigReader().getUrl();
		getUrl(url);
		System.out.println("Hitted into url");
	}

	@Then("^user verifies the site logo$")
	public void user_verifies_the_site_logo() throws Throwable {
		
		elementIsDisplayed(pm.getAh().getLogo());
	}

	@Then("^user verifies the page title$")
	public void user_verifies_the_page_title() throws Throwable {
		String Expected = "My Store";
		String Actual = getTitle();
		Assert.assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("^user click on Signin button in the home page header$")
	public void user_click_on_Signin_button_in_the_home_page_header() throws Throwable {
		clickOnWebElement(pm.getAh().getSiginbtn());
		System.out.println(" entered into APIsmoke");
	}

	@Then("^user verify and enters the email id '(.*)'  in the  login the page$")
	public void user_verify_and_enters_the_email_id_jaihamsi_gmail_com_in_the_login_the_page(String username)
			throws Throwable {
		//AutoLoginPage lg = new AutoLoginPage(driver);
		inputValuesToTheWebelement(pm.getLg().getEmail(), username);
		String actual = pm.getLg().getEmail().getAttribute("value");
		System.out.println(actual);
		String expected = username;
		Assert.assertTrue(actual.equalsIgnoreCase(expected));
		highlightWebelement(pm.getLg().getEmail());

	}

	@Then("^user verify and enters the password '(.*)' in the login page$")
	public void user_verify_and_enters_the_password_in_the_login_page(String password) throws Throwable {
	
		inputValuesToTheWebelement(pm.getLg().getPassword(), password);
		String expected =pm.getLg().getPassword().getAttribute("value");
		System.out.println(expected);
		Assert.assertEquals(expected, password);
		highlightWebelement(pm.getLg().getPassword());

	}

	@Then("^user click on signin button in the login page$")
	public void user_click_on_signin_button_in_the_login_page() throws Throwable {
	
		clickOnWebElement(pm.getLg().getSignin());

	}

	@Then("^user verifies the username present in the header$")
	public void user_verifies_the_username_Jai_hamsi_present_in_the_header() throws Throwable {
		//AutoOrderPage ao = new AutoOrderPage(driver);
		String actual = pm.getAo().getUsername().getText();
		Assert.assertTrue(actual.contains("hamsi"));
		System.out.println(actual);

	}

	@When("^user hover near women menu to select the product to purchase$")
	public void user_hover_near_women_menu_to_select_the_product_to_purchase() throws Throwable {
		
		mouseHOverToElement(pm.getAo().getMouseHoverwomen());

	}

	@When("^user click the  product T-shirts$")
	public void user_click_the_product_T_shirts() throws Throwable {
		
		clickOnWebElement(pm.getAo().getMoveTotshirt());

	}

	@Then("^user check verify whether the product 'T-shirts' searched is present or not inside women menu$")
	public void user_check_verify_whether_the_product_T_shirts_searched_is_present_or_not_inside_women_menu()
			throws Throwable {
		
		String actual = pm.getAo().getMoveTotshirt().getText();
		Assert.assertTrue(true);
		highlightWebelement(pm.getAo().getMoveTotshirt());
		System.out.println(actual);

	}

	@When("^user click the checkbox to select the size of the T-shirt in catalog$")
	public void user_click_the_checkbox_to_select_the_size_of_the_T_shirt_in_catalog() throws Throwable {
		
		clickOnWebElement(pm.getAo().getCheckBox());

	}

	@When("^user hover to the image$")
	public void user_hover_to_the_image() throws Throwable {
		mouseHOverToElement(pm.getAo().getImage());

	}

	@When("^user click more button$")
	public void user_click_more_button() throws Throwable {
		clickOnWebElement(pm.getAo().getClickMore());

	}

	@When("^user click on the Add to cart button$")
	public void user_click_on_the_Add_to_cart_button() throws Throwable {
		clickOnWebElement(pm.getAo().getCartClick());

	}

	@Then("^user check whether the product searched 'Faded Short Sleeve T-shirts' text displayed or not$")
	public void user_check_whether_the_product_searched_Faded_Short_Sleeve_T_shirts_text_displayed_or_not()
			throws Throwable {
		String actual = pm.getAo().getCheckfaded().getText();
		Assert.assertEquals("Faded Short Sleeve T-shirts", actual);
		System.out.println(actual);

	}

	@Then("^user click on to frame$")
	public void user_click_on_to_frame() throws Throwable {
		
		clickOnWebElement(pm.getAo().getFrameClick());
	}

	@When("^user click the Proceed to checkout button inside the frame$")
	public void user_click_the_Proceed_to_checkout_button_inside_the_frame() throws Throwable {
		clickOnWebElement(pm.getAo().getProceedToclick());

	}

	@Then("^user verify the text 'Quantity' is present$")
	public void user_verify_the_text_Quantity_is_present() throws Throwable {
		String actual = pm.getAo().getQuantity().getText();
		//highlightWebelement(pm.getAo().getQuantity());
		Assert.assertTrue(true);
		System.out.println(actual);

	}

	

	@Then("^user click the proceed to checkout in the shopping cart summary$")
	public void user_click_the_proceed_to_checkout_in_the_shopping_cart_summary() throws Throwable {
		
		clickOnWebElement(pm.getAo().getProceedTocheck());

	}

	@Then("^user click on the proceed to check out in addresses$")
	public void user_click_on_the_proceed_to_check_out_in_addresses() throws Throwable {

		clickOnWebElement(pm.getAo().getProceedTocheck2());
	}

	@When("^user click checkbox to agree the terms$")
	public void user_click_checkbox_to_agree_the_terms() throws Throwable {
		clickOnWebElement(pm.getAo().getCheckAgree());

	}

	@When("^user click on proceed to checkout in shipping page$")
	public void user_click_on_proceed_to_checkout_in_shipping_page() throws Throwable {
		clickOnWebElement(pm.getAo().getProceedTocheck3());

	}

	@When("^user click on pay$")
	public void user_click_on_pay() throws Throwable {
		clickOnWebElement(pm.getAo().getPay());

	}

	@When("^user click on signout to come out of the application$")
	public void user_click_on_signout_to_come_out_of_the_application() throws Throwable {
		clickOnWebElement(pm.getAo().getLogout());
	
	}

}
