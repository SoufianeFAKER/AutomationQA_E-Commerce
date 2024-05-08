@product-quantity-cart
Feature: Product quantity in Cart
  As User I want to verify product quantity in Cart

  @product-quantity-cart
  Scenario: verify product quantity in Cart
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks On View Product button for any product
    And User verify product detail is opened
    And User increase quantity to 4
    And User clicks On Add to cart button
    And User clicks On View Cart button
    Then User verify that product is displayed in cart page with exact quantity 4