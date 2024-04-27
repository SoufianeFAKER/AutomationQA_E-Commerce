@add-product
Feature: Subscription in Home page
  As User I want to Verify Subscription in Home Page

  @add-product
  Scenario: verify subscription in home page
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User Hover over first product
    And User clicks Add to cart button
    And User clicks on Continue Shopping button
    And User Hover over second product
    And User clicks Add to cart button
    And User clicks on View Cart button
    Then User verify both products are added to Cart
    And User verify their prices, quantity and total price 