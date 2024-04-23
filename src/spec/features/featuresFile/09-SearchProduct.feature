@search-product
Feature: Search Product
  As User I want to search product

  @search-product
  Scenario: search product
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Products button
    And User verify that is navigated to all products "ALL PRODUCTS" page successfully
    And User enter product name "Tshirt" in search input
    And User clicks on search button
    And User verify that search product 'SEARCHED PRODUCTS' message is visible
    Then User Verify all the products related to search "Tshirt" are visible