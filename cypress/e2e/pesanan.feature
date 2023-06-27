Feature: Pesanan Page

 Scenario: [POSITIVE] [AUT-21] As a user i want to be able to search my newly created transaction from user app
    Given I create a transaction using API flow
    When I enter altashop admin page as logged in user
    And I navigate to pesanan list page from navigation bar
    And I search for the newly created transaction ID 
    Then I will see the transaction ID in the result
    And status shown will be Belum Bayar
