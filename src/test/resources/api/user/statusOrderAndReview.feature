Feature: Transaction


#  @GetTransactions(error)
#  Scenario: TC-User-StatusOrderReviews-1
#    Given I set GET endpoints transactions
#    When I send GET HTTP request transactions
#    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-2
    Given I set GET endpoints transactions belum dibayar
    When I send GET HTTP request transactions belum dibayar
    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-3
    Given I set GET endpoints transactions dikemas
    When I send GET HTTP request transactions dikemas
    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-4
    Given I set GET endpoints transactions dikirim
    When I send GET HTTP request transactions dikirim
    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-5
    Given I set GET endpoints transactions selesai
    When I send GET HTTP request transactions selesai
    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-6
    Given I set GET endpoints transactions dibatalkan
    When I send GET HTTP request transactions dibatalkan
    Then I receive valid HTTP response code 200

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-8
    Given I set GET endpoints transactions invalid filter
    When I send GET HTTP request transactions invalid filter
    Then I receive valid HTTP response code 400

  @GetTransactions
  Scenario: TC-User-StatusOrderReviews-9
    Given I set GET endpoints transactions invalid token
    When I send GET HTTP request transactions invalid token
    Then I receive valid HTTP response code 401





#  @ConfirmOrder(ErrorBelumAdaOrderDikirim)
#  Scenario: TC-User-StatusOrderReviews-13
#    Given I set POST endpoints confirm order
#    When I send POST HTTP request confirm order
#    Then I receive valid HTTP response code 200

  @ConfirmOrder
  Scenario: TC-User-StatusOrderReviews-14
    Given I set POST endpoints confirm order
    When I send POST HTTP request confirm order invalid status
    Then I receive valid HTTP response code 400

  @ConfirmOrder
  Scenario: TC-User-StatusOrderReviews-15
    Given I set POST endpoints confirm order
    When I send POST HTTP request confirm order invalid token
    Then I receive valid HTTP response code 401

  @ConfirmOrder
  Scenario: TC-User-StatusOrderReviews-16
    Given I set POST endpoints confirm order
    When I send POST HTTP request confirm order invalid id
    Then I receive valid HTTP response code 400




  @CancelOrder
  Scenario: TC-User-StatusOrderReviews-17
    Given I set POST endpoints cancel order
    When I send POST HTTP request cancel order
    Then I receive valid HTTP response code 400

  @CancelOrder
  Scenario: TC-User-StatusOrderReviews-18
    Given I set POST endpoints cancel order
    When I send POST HTTP request cancel order invalid status
    Then I receive valid HTTP response code 400

  @CancelOrder
  Scenario: TC-User-StatusOrderReviews-19
    Given I set POST endpoints cancel order
    When I send POST HTTP request cancel order invalid token
    Then I receive valid HTTP response code 401

  @CancelOrder
  Scenario: TC-User-StatusOrderReviews-20
    Given I set POST endpoints cancel order
    When I send POST HTTP request cancel order invalid id
    Then I receive valid HTTP response code 400