
/*Task 2: Bing Search Title Verification
1. Go to https://www.google.com
2. Search for “orange”
3. Verify title is:
a. Expected = “orange – Search”

Note:
1. Follow POM Design Pattern
2. BDD implementation*/

Feature: Bing search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Bing search page
    Then user should see title is Bing
    When user search the "orange"
    Then title is "orange - Suchen"
