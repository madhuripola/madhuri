Feature: select checkbox_nc

  Background: Given launch the chrome browser

  @Regression
  Scenario: Validate checkbox functionality and delete data
    When open nc login page1
    And enter email and password as credentials
      | admin@yourstore.com | admin |
    And click on login
    Then Verify login got success1
    When click on catalog main module
    And click on products sub module
    Then verify the first checkbox
    When click on the first checkbox
    And click on delete button
    And click on yes button
    Then verify first check box product got deleted
