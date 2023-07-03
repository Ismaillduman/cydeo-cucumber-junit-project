Feature: Etsy search functionality
  Agile story: User should be able to type any keyword and see relevant information
@etsy
  Scenario: Etsy Title Verification
    Given user is on the Etsy webpage
    Then user sees title is as expected

  Scenario: Etsy Search Functionality Title Verification
    Given user is on the Etsy webpage
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden Spoon is in the title

  @etsy
  Scenario: Etsy Search Functionality Title Verification
    Given user is on the Etsy webpage
    When user types "Wooden spoon" in the search box
    And user clicks search button
    Then user sees "Wooden spoon" is in the title