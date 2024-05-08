@register-while-checkout
Feature: Place Order: Register while Checkout
  As User I want to Place Order and Register While Checkout

  @register-while-checkout
  Scenario: register while checkout
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User Hover over first product
    And User clicks Add to cart button in Box1
    And User clicks on Continue Shopping button
    And User Hover over second product
    And User clicks Add to cart button in Box2
    And User clicks on View Cart button
    And User clicks on Cart button
    And User verify that cart page is displayed
    And User clicks on Proceed To Checkout button
    And User clicks on Register Login button
    And User enters name "Soufiane FAKER" and email address "sfaker_01@yahoo.fr"
    And User clicks on Signup button
    And User chooses Title
    And User enters the details into account information fields
      | name     | Soufiane FAKER |
      | password |          12345 |
    And User chooses Date of Birth
    And User select checkbox Sign up for our newsletter
    And User select checkbox Receive special offers from our partners
    And User enters the details into address information fields
      | firstName    | Soufiane        |
      | lastName     | FAKER           |
      | company      | Proservices     |
      | address      | Cité El Ghazala |
      | address2     | Tunisia         |
      | state        | Married         |
      | city         | Nabeul          |
      | zipcode      |       123456789 |
      | mobileNumber |   0021697564144 |
    And User select a Country
    And User clicks on Create Account button
    And User verify that Account Created "ACCOUNT CREATED!" text is visible
    And User clicks on Continue button
    And User verify that Logged UserName "Logged in as Soufiane FAKER" text is visible
    And User clicks on Cart button
    And User clicks on Proceed To Checkout button
    And User verify messages "Address Details" and "Review Your Order"
    And User enters description in comment text area "Thank you for all Tester QA members"
    And User clicks on Place Order button
    And User enters payment details below
      | NameOnCard      | Soufiane FAKER |
      | CardNumber      |    12345678907 |
      | CVC             |            033 |
      | ExpirationMonth |             02 |
      | ExpirationYear  |           2030 |
    And User clicks on Pay and Confirm Order button
    And User verify success message "Congratulations! Your order has been confirmed!" is displayed
    And User clicks on Delete Account button
    Then User verify that Account Deleted "ACCOUNT DELETED!" text is visible
    And User clicks on Continue button
