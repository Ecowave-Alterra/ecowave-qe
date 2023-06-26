Feature: Registration

  Scenario Outline: [POS] - Check when user tries to register given valid credentials
    Given user on landing screen
    When user select profile page
    And user select register option
    And user fill valid name as: "randomized name"
    And user fill valid non-registered email as: "randomized email"
    And user fill valid username as: "randomized username"
    And user fill valid phone number as: "randomized phone number"
    And user fill valid password as: "<password>"
    And user press submit register button
    Then user see "Registration Successful" message on registration page
    Examples:
      | password          |
      | test@1234         |