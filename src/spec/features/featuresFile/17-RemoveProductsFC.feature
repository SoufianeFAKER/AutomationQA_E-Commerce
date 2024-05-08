@remove-products
Feature: Remove Products From Cart
  As User I want to remove products from Cart

  @login-before-checkout
  Scenario: remove products from Cart
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User Hover over first product
    And User clicks Add to cart button in Box1
    And User clicks on Continue Shopping button
    And User clicks on Cart button
    And User verify that cart page is displayed
    Then User clicks X button corresponding to particular product
    And User verify that product is removed from the cart "Cart is empty! Click here to buy products."
    