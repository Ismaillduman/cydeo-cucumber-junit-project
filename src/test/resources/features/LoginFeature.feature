Feature: Library login feature

  User Story:

  As a user I should be able to login with valid credentials
  Accounts are: librarian, student, admin

Scenario: Login as librarian
Given user is on the login page of the library application
When user enters librarian username
And user enters librarian password
Then user should see the dashboard