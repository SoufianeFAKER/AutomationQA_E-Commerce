@login-before-checkout
Feature: Place Order: Login before Checkout
  As User I want to Place Order and Login Before Checkout

  @login-before-checkout
  Scenario: login before checkout
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on SignupLogin button
    And User enters email "sfaker@yahoo.fr" and password "12345"
    And User clicks on Login button
    And User verify that Logged UserName "Logged in as Soufiane FAKER" text is visible
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
    And User verify messages "Address Details" and "Review Your Order"
    And User enters description in comment text area "Thank you for all Tester QA members"
    And User clicks on Place Order button
    And User enters payment details below
      | NameOnCard      | Soufiane FAKER |
      | CardNumber      |    12345678907 |
      | CVC             |            033 |
      | ExpirationMonth |             02 |
      | ExpirationYear  |           2030 |
    Then User clicks on Pay and Confirm Order button
    And User verify success message "Congratulations! Your order has been confirmed!" is displayed
    #And User clicks on Delete Account button
    #Then User verify that Account Deleted "ACCOUNT DELETED!" text is visible
    #And User clicks on Continue button