@add-review
Feature: Add Review On Product
  As User I want to add review on product

  @add-review
  Scenario: add review on product
    Given User navigates to application
    When User verify that home page is visible successfully
    And User clicks on Products button
    And User verify that is navigated to all products "ALL PRODUCTS" page successfully
    And User clicks on View Product button of first product
    And User verify that message "WRITE YOUR REVIEW" is visible
    And User fills the fields below
      | name   | Soufiane FAKER              |
      | email  | sfaker@yahoo.fr             |
      | review | Fine ... Excellent Products |
    And User clicks on submit button
    Then User verify success message "Thank you for your review."
