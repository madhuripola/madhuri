Feature: LoginWithData_Nc

  Background: Given launch the chrome browser

  #@Smoke
  #Scenario: Validate login functionality with given data
    #When open Nc login page in opened browser
    #When enter valid "admin@yourstore.com" in email field
    #When enter valid "admin" in password field
    #When click on the login button
    #Then verify login got success
#
  #@Regression
  #Scenario Outline: Validate login functionality with given data
    #When open Nc login page in opened browser
    #When enter valid "<Email>" in email field
    #When enter valid "<Password>" in password field
    #When click on the login button
    #Then verify login got success
#
    #Examples: 
      #| Email               | Password |
      #| admin@yourstore.com | admin    |
      #| test@yourstore.com  | admin    |
      #| admin@yourstore.com | test     |

  @Smoke
  Scenario: Validate login functionality with data table data
    Given user should launch the chrome browser
    When user should open nc login page
    And user enter email and password as credentials
      | admin@yourstore.com | admin |
      | test@yourstore.com  | admin |
    And user click on login button
    Then user verify login success
