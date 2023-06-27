Feature: Login

#Positive case covered on E2E

 Scenario Outline: [POSITIVE] [AUT-3] As a user i want to be able to login given valid credentials  
    Given I open altashop login page
    When I enter email as <email>
    And I enter password as <password>
    And I press login submit button
    Then I will be directed to admin homepage
    Examples:
    | email           | password                |
    | admin@gmail.com | admin123                |

 Scenario Outline: [Negative] [AUT-4] As a user i want to be able to see error message when giving invalid email format  
    Given I open altashop login page
    When I enter email as <email>
    And I enter password as <password>
    And I press login submit button
    Then I will see error message for invalid email format
    Examples:
    | email           | password                |
    | admin123        | admin123                |
