@register-user-existing-email
Feature: Regiter User With Existing Email
  As User I want to register with existing email

  @register-existing-email
  Scenario: Regiter user with existing email
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on SignupLogin button
    And User verify that new user "New User Signup!" text is visible 
    And User enters name "Soufiane FAKER" and email address "sfaker@yahoo.fr"
    And User clicks on Signup button
    Then User verify register error message "Email Address already exist!" is visible