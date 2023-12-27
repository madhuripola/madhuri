Feature: Login_Nc

  Background: 
    Given launch the chrome browser

  @Regression
  Scenario: Validate the NC login functionality
    When Open Nc login page
    And Enter valid email id
    And Enter valid password
    And click on login button
    Then verify login success
