@scroll-Up-using-arrow
Feature: Scroll Up using Arrow button and Scroll Down functionality
  As User I want to Verify Scroll Up using Arrow button and Scroll Down functionality

  @scroll-Up-using-arrow
  Scenario: verify Scroll Up using Arrow button and Scroll Down functionality
    Given User navigates to application
    When User verify that home page is visible successfully
    And User scroll down page to bottom
    And User verify text "SUBSCRIPTION" is visible
    And User clicks on arrow at bottom right side to move upward
    Then User verify that page is scrolled up
    And User verify that "Full-Fledged practice website for Automation Engineers" text is visible on screen