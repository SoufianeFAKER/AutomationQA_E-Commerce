@verify-test-case
Feature: Verify Test Cases Page
  As User I want verify test cases Page
  
  @page-test-cases
  Scenario: Verify Test Cases Page
  Given User navigates to application
  And User verify that home page is visible successfully
  When User clicks on Test Cases button
  Then User verify that Test Cases "TEST CASES" text is visible
  