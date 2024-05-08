@search-products-cart
Feature: Search Products and Verify Cart After Login
  As User I want to Search Products and Verify Cart After Login

  @search-products-cart
  Scenario: search products and verify Cart after login
    Given User navigates to application
    When User verify that home page is visible successfully
    And User clicks on Products button
    And User verify that is navigated to all products "ALL PRODUCTS" page successfully
    And User enter product name "Tshirt" in search input
    And User clicks on search button
    And User verify that search product "SEARCHED PRODUCTS" message is visible
    And User Add those products to Cart
    And User clicks on Cart button
    And User verify that products are visible in Cart
    And User clicks on SignupLogin button
    And User enters email "sfaker@yahoo.fr" and password "12345"
    And User clicks on Login button
    And User verify that Logged UserName "Logged in as Soufiane FAKER" text is visible
    And User clicks on Cart button
    Then User verify that products are visible in Cart