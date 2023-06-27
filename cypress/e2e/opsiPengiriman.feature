Feature: Opsi Pengiriman

 Scenario: [POSITIVE] [AUT-20] As a user i want to be able to see opsi pengiriman list page
    Given I enter altashop admin page as logged in user
    When I navigate to opsi pengiriman list page from navigation bar
    Then I will see opsi pengiriman page title
    And I will see the correct columns shown on the opsi pengiriman data table
    And I will see the current page as 1