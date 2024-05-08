@view-cart-brand-product
Feature: View And Cart Brand Products
  As User I want to verify View And Cart Brand Products

  @view-cart-brand-product
  Scenario: view and cart brand products
    Given User navigates to application
    When User verify that home page is visible successfully
    And User clicks on Products button
    And User verify that Brands "BRANDS" are visible on left side bar
    And User clicks on POLO Brand name
    And User verify that user is navigated to brand page "BRAND - POLO PRODUCTS"
    And User verify that brand products are displayed
    And User clicks on BIBA Brand name
    Then User verify that user is navigated to brand page "BRAND - BIBA PRODUCTS"
    And User verify that brand products are displayed