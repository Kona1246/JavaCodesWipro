Feature: Login functionality

  Scenario Outline: Successful Login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see the home page

    Examples:
      | username | password |
      | shay123  | hi123    |
      | shayaan  | 1234     |

  Scenario Outline: Failed login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see an error message

    Examples:
      | username | password |
      | shay178  | hi19     |
      | shaan    | 120      |
