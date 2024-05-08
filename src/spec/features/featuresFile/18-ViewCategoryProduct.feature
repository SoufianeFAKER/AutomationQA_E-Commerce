@view-category-product
Feature: View Category Products
  As User I want to verify view category products

  @view-category-product
  Scenario: view category products
    Given User navigates to application
    When User verify that home page is visible successfully
    And User verify that categories "CATEGORY" are visible on left side bar
    And User clicks on Women category button
    And User clicks on sub Category link TOPS
    And User verify that category page is displayed
    And User confirm that text "WOMEN - TOPS PRODUCTS"
    And User clicks on Men category button
    And User clicks on sub Category link JEANS
    Then User verify that category page is displayed
    #And User confirm that text "MEN - JEANS PRODUCTS"
