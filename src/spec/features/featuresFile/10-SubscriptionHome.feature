@subscription-home
Feature: Subscription in Home page
  As User I want to Verify Subscription in Home Page

  @subscription-home
  Scenario: verify subscription in home page
    Given User navigates to application
    And User verify that home page is visible successfully
    And User Scroll down to footer
    And User verify text 'SUBSCRIPTION' is visible
    And User enters email address "test@gmail.com" in input feiel
    And User clicks on arrow button
    Then User verify success message "You have been successfully subscribed!" is visible
