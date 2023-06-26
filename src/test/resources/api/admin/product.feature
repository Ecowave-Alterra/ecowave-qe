Feature: Product

  @GetAllProduct
  Scenario: TC-Product-1
    Given I set GET endpoints product
    When I send GET HTTP request product
    Then I receive valid HTTP response code 200

  @GetAllProduct
  Scenario: TC-Product-2
    Given I set GET endpoints product
    When I send GET HTTP request product without token
    Then I receive valid HTTP response code 401



  @GetProductById
  Scenario: TC-Product-3
    Given I set GET endpoints product by id
    When I send GET HTTP request product by id
    Then I receive valid HTTP response code 200

  @GetProductById
  Scenario: TC-Product-4
    Given I set GET endpoints product by wrong id
    When I send GET HTTP request product by wrong id
    Then I receive valid HTTP response code 404

  @GetProductById
  Scenario: TC-Product-5
    Given I set GET endpoints product by id
    When I send GET HTTP request product by id without token
    Then I receive valid HTTP response code 401



  @SearchProduct
  Scenario: TC-Product-6
    Given I set GET endpoints search product
    When I send GET HTTP request search product
    Then I receive valid HTTP response code 200

  @SearchProduct
  Scenario: TC-Product-7
    Given I set GET endpoints search not exist product
    When I send GET HTTP request search not exist product
    Then I receive valid HTTP response code 404

  @SearchProduct
  Scenario: TC-Product-8
    Given I set GET endpoints search product
    When I send GET HTTP request search product without token
    Then I receive valid HTTP response code 401

  @SearchProduct
  Scenario: TC-Product-9
    Given I set GET endpoints search product by filter
    When I send GET HTTP request search product by filter
    Then I receive valid HTTP response code 200

  @SearchProduct
  Scenario: TC-Product-10
    Given I set GET endpoints search not exist product by filter
    When I send GET HTTP request search not exist product by filter
    Then I receive valid HTTP response code 404



#  @CreateProduct(error)
#  Scenario: TC-Product-11
#    Given I set POST endpoints create product
#    When I send POST HTTP request create product
#    Then I receive valid HTTP response code 201

  @CreateProduct
  Scenario: TC-Product-12
    Given I set POST endpoints create product
    When I send POST HTTP request create product incomplete data
    Then I receive valid HTTP response code 400

  @CreateProduct
  Scenario: TC-Product-13
    Given I set POST endpoints create product
    When I send POST HTTP request create product without token
    Then I receive valid HTTP response code 401



#  @DeleteProduct(error)
#  Scenario: TC-Product-14
#    Given I set DELETE endpoints product
#    When I send DELETE HTTP request product
#    Then I receive valid HTTP response code 200 -> 500

  @DeleteProduct
  Scenario: TC-Product-15
    Given I set DELETE endpoints product by wrong id
    When I send DELETE HTTP request product by wrong id
    Then I receive valid HTTP response code 404

  @DeleteProduct
  Scenario: TC-Product-16
    Given I set DELETE endpoints product
    When I send DELETE HTTP request product without token
    Then I receive valid HTTP response code 401



  @UpdateProduct
  Scenario: TC-Product-17
    Given I set PUT endpoints product
    When I send PUT HTTP request product
    Then I receive valid HTTP response code 200

  @UpdateProduct
  Scenario: TC-Product-18
    Given I set PUT endpoints product incomplete data
    When I send PUT HTTP request product incomplete data
    Then I receive valid HTTP response code 200

  @UpdateProduct
  Scenario: TC-Product-19
    Given I set PUT endpoints product
    When I send PUT HTTP request product without token
    Then I receive valid HTTP response code 401