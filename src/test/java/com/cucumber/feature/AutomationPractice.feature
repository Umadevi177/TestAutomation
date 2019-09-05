@APIendtoend
Feature:  User test the Automation practice with valid credentials and functionality
The user should be able to login into the  website when the username and the password are correct.
@HomePage
Scenario: Verify user validate the automation practice home page
Given user hit the automation practice website
Then user verifies the site logo
And user verifies the page title
When user click on Signin button in the home page header
@EndtoEndLogin
Scenario: Verify whether user login the application with valid authentication
Then user verify and enters the email id 'jaihamsi40@gmail.com'  in the  login the page
Then user verify and enters the password '12345' in the login page
And user click on signin button in the login page
Then user verifies the username present in the header
@EndtoEndorder
Scenario: With user account the user place the order in the application with valid functionality  
When user hover near women menu to select the product to purchase 
And user click the  product T-shirts 
Then user check verify whether the product 'T-shirts' searched is present or not inside women menu
@testcase1
Scenario: user give the product details such as size,color to place order
When user click the checkbox to select the size of the T-shirt in catalog
When user hover to the image
And user click more button 
And user click on the Add to cart button
Then user check whether the product searched 'Faded Short Sleeve T-shirts' text displayed or not

@testcase2
Scenario: User Proceed to checkout the product
When user click on to frame
When user click the Proceed to checkout button inside the frame
Then user verify the text 'Quantity' is present
And  user click the proceed to checkout in the shopping cart summary
And user click on the proceed to check out in addresses 
@logout
Scenario: User place order with terms and conditions
When user click checkbox to agree the terms
And user click on proceed to checkout in shipping page
And user click on pay
And user click on signout to come out of the application








