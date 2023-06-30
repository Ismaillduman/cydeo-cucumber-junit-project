Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

# control option L to fix line
  @Google
  Scenario: Search page default title verification

    When user is on the Google search page
    Then user should see title is Google
    When user search the "orange"
    Then title is "orange - Google Suche"