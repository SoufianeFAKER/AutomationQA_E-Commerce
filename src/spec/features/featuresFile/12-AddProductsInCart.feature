@add-product
Feature: Add Products in Cart
  As User I want to add products in Cart

  @add-product
  Scenario: add products in Cart
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User Hover over first product
    And User clicks Add to cart button in Box1
    And User clicks on Continue Shopping button
    And User Hover over second product
    And User clicks Add to cart button in Box2
    And User clicks on View Cart button
    Then User verify both products are added to Cart
    And User verify their prices, quantity and total price 