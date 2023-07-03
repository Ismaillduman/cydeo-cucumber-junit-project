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

  Scenario Outline: Url verification

    Given User on the web-table.cydeo webpage
    When User enter user name as "<username>"
    And User enter password as "<password>"
    Then user verify URL

    Examples:Enter this credentials
      | username | password |
      | Test     | Tester   |

  @webTable2
  Scenario:  Order place scenario
    Given user is already logged in to The Web table app
    When user is on the order page
    Then user sees below options under product dropdown

      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the order page
    Then user sees below radio buttons enabled for
      | Visa             |
      | Mastercard       |
      | American Express |
