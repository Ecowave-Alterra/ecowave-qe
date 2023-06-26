Feature: Login

  Scenario Outline: [POS] - Check when user tries to login using registered email
    Given user has successfully register
    When user navigate to login page
    And user input registered email
    And user input password: "<password>"
    And user tap login button
    Then user see email message displayed on home screen
    Examples:
      | password          |
      | test@1234         |
