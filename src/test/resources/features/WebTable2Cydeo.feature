Feature: Login functionality
  @webTable2
  Scenario: Url verification
    Given User on the web-table.cydeo webpage
    When User enter user name as Test
    And User enter password as Tester
    Then user verify URL
  @webTable2
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

  @webTable2
  Scenario:  Order place scenario
    Given user is already logged in to The Web table app
    When user is on the order page
    Then user sees below options under product dropdown

      | MoneyCog   |
      | Familybea  |
      | Screenable |

  @webTable2
  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the order page
    Then user sees below radio buttons enabled for
      | Visa             |
      | MasterCard       |
      | American Express |

  @webTable2
  Scenario Outline: Order placement scenario
    Given user is already logged in to The Web table app
    When user is on the order page
    And user enters quantity "<quantity>"
    And user click the calculate button
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user enters cardType "<cardType>"
    And user enters cardNo "<cardNo>"
    And user enters expiryDate "<expiryDate>"
    And user clicks place order button
    Then user should see "<expectedName>" in the firs row of the table

    Examples:
      | quantity | customerName | street | city | state | zip   | cardType | cardNo           | expiryDate | expectedName |
      | 3        | John Doe     | 7th st | NY   | NY    | 99999 | Visa     | 1111222233334444 | 12/25      | John Doe     |
      | 3        | Jane Doe     | 7th st | NY   | NY    | 99999 | Visa     | 1111222233334444 | 12/25      | Jane Doe     |
      | 3        | Jack Doe     | 7th st | NY   | NY    | 99999 | Visa     | 1111222233334444 | 12/25      | Jack Doe     |
