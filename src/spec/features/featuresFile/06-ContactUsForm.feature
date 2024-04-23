@contact-us-form
Feature: Contact Us Form
  As User I want verify the Contact Us Form

  @contact-us-form
  Scenario: Verify the Contact Us Form
    Given User navigates to application
    And User verify that home page is visible successfully
    When User clicks on Contact Us button
    And User verify that Get In Touch "GET IN TOUCH" message is visible
    And User enters the details into Contact Us Form fields
      | name    | Soufiane                                                                                  |
      | email   | sfaker@yahoo.fr                                                                           |
      | subject | Bug Detected in your webSite                                                              |
      | message | when I click on the login button, an error message appears. Please check your login page. |
    And User Upload file
    And User clicks on Submit button
    And User click on OK button
    Then User verify that sucess message "Success! Your details have been submitted successfully." is visible
    And User clicks on Home button
    And User verify that home page is visible successfully
