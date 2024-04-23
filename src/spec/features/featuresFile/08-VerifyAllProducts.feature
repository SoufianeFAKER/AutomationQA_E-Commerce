@verify-all-products
Feature: Verify All Products and product detail page
  As User I want to verify all products and product detail page

  @verify-all-products
  Scenario: verify all products and product detail page
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User verify that is navigated to all products "ALL PRODUCTS" page successfully
    And User verify that the products list is visible
    And User clicks on View Product button of first product
    Then User is landed to product detail page
    And User verify that the Product Name is visible
    And User verify that the Category is visible
    And User verify that the Price is visible
    And User verify that the Availability is visible
    And User verify that the Condition is visible
    And User verify that the Brand is visible
