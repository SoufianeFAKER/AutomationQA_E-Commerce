@subscription-cart
Feature: Subscription in Cart page
  As User I want to Verify Subscription in Cart Page

  @subscription-cart
  Scenario: verify subscription in cart page
    Given User navigates to application
    And User verify that home page is visible successfully
    And User clicks on Cart button
    And User Scroll down to footer
    And User verify text 'SUBSCRIPTION' is visible
    And User enters email address "test@gmail.com" in input feiel
    And User clicks on arrow button
    Then User verify success message "You have been successfully subscribed!" is visible