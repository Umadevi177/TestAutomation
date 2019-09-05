$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPractice.feature");
formatter.feature({
  "line": 2,
  "name": "User test the Automation practice with valid credentials and functionality",
  "description": "The user should be able to login into the  website when the username and the password are correct.",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@APIendtoend"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify user validate the automation practice home page",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;verify-user-validate-the-automation-practice-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@HomePage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user hit the automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user verifies the site logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verifies the page title",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on Signin button in the home page header",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_hit_the_automation_practice_website()"
});
formatter.result({
  "duration": 9960301257,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_the_site_logo()"
});
formatter.result({
  "duration": 146462881,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_the_page_title()"
});
formatter.result({
  "duration": 12024901,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button_in_the_home_page_header()"
});
formatter.result({
  "duration": 9231472256,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify whether user login the application with valid authentication",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;verify-whether-user-login-the-application-with-valid-authentication",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@EndtoEndLogin"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user verify and enters the email id \u0027jaihamsi40@gmail.com\u0027  in the  login the page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user verify and enters the password \u002712345\u0027 in the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click on signin button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user verifies the username present in the header",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "jaihamsi40@gmail.com",
      "offset": 37
    }
  ],
  "location": "Stepdefinition.user_verify_and_enters_the_email_id_jaihamsi_gmail_com_in_the_login_the_page(String)"
});
formatter.result({
  "duration": 399269129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 37
    }
  ],
  "location": "Stepdefinition.user_verify_and_enters_the_password_in_the_login_page(String)"
});
formatter.result({
  "duration": 350500176,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_signin_button_in_the_login_page()"
});
formatter.result({
  "duration": 2920582304,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_the_username_Jai_hamsi_present_in_the_header()"
});
formatter.result({
  "duration": 51617743,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "With user account the user place the order in the application with valid functionality",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;with-user-account-the-user-place-the-order-in-the-application-with-valid-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@EndtoEndorder"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user hover near women menu to select the product to purchase",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user click the  product T-shirts",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user check verify whether the product \u0027T-shirts\u0027 searched is present or not inside women menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_hover_near_women_menu_to_select_the_product_to_purchase()"
});
formatter.result({
  "duration": 206625781,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_product_T_shirts()"
});
formatter.result({
  "duration": 4381039379,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_check_verify_whether_the_product_T_shirts_searched_is_present_or_not_inside_women_menu()"
});
formatter.result({
  "duration": 60236868,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "user give the product details such as size,color to place order",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;user-give-the-product-details-such-as-size,color-to-place-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@testcase1"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user click the checkbox to select the size of the T-shirt in catalog",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user hover to the image",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user click more button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click on the Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user check whether the product searched \u0027Faded Short Sleeve T-shirts\u0027 text displayed or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_click_the_checkbox_to_select_the_size_of_the_T_shirt_in_catalog()"
});
formatter.result({
  "duration": 272701294,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_hover_to_the_image()"
});
formatter.result({
  "duration": 195349051,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_more_button()"
});
formatter.result({
  "duration": 3797934789,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_Add_to_cart_button()"
});
formatter.result({
  "duration": 174764443,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_check_whether_the_product_searched_Faded_Short_Sleeve_T_shirts_text_displayed_or_not()"
});
formatter.result({
  "duration": 67953015,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User Proceed to checkout the product",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;user-proceed-to-checkout-the-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@testcase2"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user click on to frame",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user click the Proceed to checkout button inside the frame",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user verify the text \u0027Quantity\u0027 is present",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user click the proceed to checkout in the shopping cart summary",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user click on the proceed to check out in addresses",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_to_frame()"
});
formatter.result({
  "duration": 1272027899,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_Proceed_to_checkout_button_inside_the_frame()"
});
formatter.result({
  "duration": 3058791051,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verify_the_text_Quantity_is_present()"
});
formatter.result({
  "duration": 64138594,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_proceed_to_checkout_in_the_shopping_cart_summary()"
});
formatter.result({
  "duration": 2164049145,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_proceed_to_check_out_in_addresses()"
});
formatter.result({
  "duration": 2002793819,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User place order with terms and conditions",
  "description": "",
  "id": "user-test-the-automation-practice-with-valid-credentials-and-functionality;user-place-order-with-terms-and-conditions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user click checkbox to agree the terms",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user click on proceed to checkout in shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user click on pay",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user click on signout to come out of the application",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_checkbox_to_agree_the_terms()"
});
formatter.result({
  "duration": 181217470,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_proceed_to_checkout_in_shipping_page()"
});
formatter.result({
  "duration": 1818389650,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_pay()"
});
formatter.result({
  "duration": 1539071630,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_signout_to_come_out_of_the_application()"
});
formatter.result({
  "duration": 1829704374,
  "status": "passed"
});
});