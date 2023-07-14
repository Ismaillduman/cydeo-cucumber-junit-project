@Bing
Feature: Bing search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Bing search page
    Then user should see title is Bing
    When user bing search the "orange"
    Then title is on the bing "orange - Suchen"
