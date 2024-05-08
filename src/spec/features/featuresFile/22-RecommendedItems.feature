@add-items
Feature: Add T Cart From Recommended Items
  As User I want to add to cart from recommended items

  @add-items
  Scenario: add to cart from recommended items
    Given User navigates to application
    When User verify that home page is visible successfully
    And User scroll to bottom of page
    And User verify the following message "RECOMMENDED ITEMS" are visible
    And User clicks on Add To Cart button on Recommended product
    And User clicks on View Cart button
    Then User verify that product is displayed in cart page
