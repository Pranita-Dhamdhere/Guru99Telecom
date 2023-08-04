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

  #Add Tariff Plan created by Manish
  Scenario: Test the Add Tariff Plan Page
    When user click on Home Link
    Then user click on Add Tariff Plan Link
    And user enter Monthly Rental and Free Local minutes and Free International minutes and Free SMS pack
    And user enter Local per minute charge and International per minute charge and SMS per charge
    And click on submit button
