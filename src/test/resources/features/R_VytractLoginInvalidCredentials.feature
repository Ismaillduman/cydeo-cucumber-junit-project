Feature: Users should not be able to login
  User Story:
  As a user, I should not be able to login with incorrect credentials. And Login should be displayed in title.

  @invalidLoginWithParamsSceOutLine
  Scenario Outline: Login with invalid credential
    Given user is on the login page
    When the user login with "<username>","<password>"
    Then the user should not be able to log in

    Examples:
      | username        | password      |
      | wrongUserName   | UserUser123   |
      | salesmanager101 | wrongPassword |
      | wrongUserName   | wrongPassword |
      | wrongUserName   | empty         |
      | empty           | wrongPassword |
      | empty           | empty         |