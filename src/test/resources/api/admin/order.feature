Feature: Orders


  @GetAllOrder
  Scenario: TC-Orders-1
    Given I set GET endpoints order
    When I send GET HTTP request order
    Then I receive valid HTTP response code 200

  @GetAllOrders
  Scenario: TC-Orders-3
    Given I set GET endpoints order
    When I send GET HTTP request order without token
    Then I receive valid HTTP response code 401

  @GetAllOrders
  Scenario: TC-Orders-5
    Given I set GET endpoints order by page size
    When I send GET HTTP request order by page size
    Then I receive valid HTTP response code 200

  @GetAllOrders
  Scenario: TC-Orders-6
    Given I set GET endpoints order by page number
    When I send GET HTTP request order by page number
    Then I receive valid HTTP response code 200

  @GetAllOrders
  Scenario: TC-Orders-8
    Given I set GET endpoints order by status
    When I send GET HTTP request order by status
    Then I receive valid HTTP response code 200




  @GetOrderById
  Scenario: TC-Orders-11
    Given I set GET endpoints order by id
    When I send GET HTTP request order by id
    Then I receive valid HTTP response code 200

  @GetOrderById
  Scenario: TC-Orders-13
    Given I set GET endpoints order by id
    When I send GET HTTP request order by id without token
    Then I receive valid HTTP response code 401

  @GetOrderById
  Scenario: TC-Orders-14
    Given I set GET endpoints order by invalid id
    When I send GET HTTP request order by invalid id
    Then I receive valid HTTP response code 400




#  @UpdateOrder(ERROR)
#  Scenario: TC-Orders-15
#    Given I set PUT endpoints order
#    When I send PUT HTTP request order
#    Then I receive valid HTTP response code 200
#
#  @UpdateProduct(ERROR)
#  Scenario: TC-Orders-16
#    Given I set PUT endpoints order
#    When I send PUT HTTP invalid request order
#    Then I receive valid HTTP response code 400
#
#  @UpdateProduct(ERROR)
#  Scenario: TC-Orders-17
#    Given I set PUT endpoints order invalid id
#    When I send PUT HTTP request order invalid id
#    Then I receive valid HTTP response code 400

  @UpdateProduct
  Scenario: TC-Orders-18
    Given I set PUT endpoints order
    When I send PUT HTTP request order invalid token
    Then I receive valid HTTP response code 401