@address-details
Feature: Verify Address Details In Checkout Page
  As User I want to verify address details in checkout page

  @address-details
  Scenario: verify address details in checkout page
    Given User navigates to application
    When User verify that home page is visible successfully
    And User clicks on SignupLogin button
    And User enters name "Soufiane FAKER" and email address "sfaker_02@yahoo.fr"
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
    And User clicks on Products button
    And User Hover over first product
    And User clicks Add to cart button in Box1
    And User clicks on Continue Shopping button
    And User Hover over second product
    And User clicks Add to cart button in Box2
    And User clicks on Cart button
    And User verify that cart page is displayed
    And User clicks on Proceed To Checkout button
    And User verify that the delivery address is same address filled at the time registration of account
    And User verify that the billing address is same address filled at the time registration of account
    And User clicks on Delete Account button
    Then User verify that Account Deleted "ACCOUNT DELETED!" text is visible
    And User clicks on Continue button