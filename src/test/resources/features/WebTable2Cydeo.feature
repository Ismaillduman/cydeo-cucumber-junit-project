Feature: Login functionality

  Scenario: Url verification
    Given User on the web-table.cydeo webpage
    When User enter user name as Test
    And User enter password as Tester
    Then user verify URL

  Scenario: Url verification
    Given User on the web-table.cydeo webpage
    When User enter user name as "Test"
    And User enter password as "Tester"
    Then user verify URL
  @webTable2
    Scenario Outline: Url verification

      Given User on the web-table.cydeo webpage
      When User enter user name as "<username>"
      And User enter password as "<password>"
      Then user verify URL

      Examples:Enter this credentials
        | username | password |
        | Test     | Tester   |