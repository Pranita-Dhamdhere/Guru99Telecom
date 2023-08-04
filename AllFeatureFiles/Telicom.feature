Feature: Telecom Application test cases.

  #home page created by Pranita
  Scenario: Test the Home Page Functionality
    Given user on home page
    When user validatae url and title
    Then user click on Add Customer link

# AddCustomerPage Created by Sulbha Date
  Scenario: Test the AddCustomerDetails
    When User Select Background Radio button
    And User enter Firstname and Lastname and Email and Address and Mobilenumber
    And User click on Submit button
    Then User capture the customer ID
