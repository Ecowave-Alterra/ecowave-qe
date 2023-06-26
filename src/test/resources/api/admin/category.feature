Feature: Product Category

  @GetAllProdCategory
  Scenario: TC-ProdCategory-1
    Given I set GET endpoints product category
    When I send GET HTTP request product category
    Then I receive valid HTTP response code 200

  @GetAllProdCategory
  Scenario: TC-ProdCategory-2
    Given I set GET endpoints product category
    When I send GET HTTP request product category without token
    Then I receive valid HTTP response code 401



#  @CreateProdCategory(ERROR)
#    Scenario: TC-ProdCategory-3
#    Given I set POST endpoints create product category
#    When I send POST HTTP request create product category
#    Then I receive valid HTTP response code 201
#
#  @CreateProdCategory(ERROR)
#  Scenario: TC-ProdCategory-4
#    Given I set POST endpoints create product category
#    When I send POST HTTP request create product category incomplete data
#    Then I receive valid HTTP response code 400
#
#  @CreateProdCategory(ERROR)
#  Scenario: TC-ProdCategory-5
#    Given I set POST endpoints create product category
#    When I send POST HTTP request create product category without token
#    Then I receive valid HTTP response code 401



  @UpdateProdCategory
  Scenario: TC-ProdCategory-6
    Given I set PUT endpoints category
    When I send PUT HTTP request category
    Then I receive valid HTTP response code 200

  @UpdateProdCategory
  Scenario: TC-ProdCategory-7
    Given I set PUT endpoints category incomplete data
    When I send PUT HTTP request category incomplete data
    Then I receive valid HTTP response code 400

  @UpdateProdCategory
  Scenario: TC-ProdCategory-8
    Given I set PUT endpoints category
    When I send PUT HTTP request category without token
    Then I receive valid HTTP response code 401



  @DeleteProdCategory
  Scenario: TC-ProdCategory-9
    Given I set DELETE endpoints category
    When I send DELETE HTTP request category
    Then I receive valid HTTP response code 200

  @DeleteProdCategory
  Scenario: TC-ProdCategory-10
    Given I set DELETE endpoints category by wrong id
    When I send DELETE HTTP request category by wrong id
    Then I receive valid HTTP response code 404

  @DeleteProdCategory
  Scenario: TC-ProdCategory-11
    Given I set DELETE endpoints category
    When I send DELETE HTTP request category without token
    Then I receive valid HTTP response code 401




  @SearchProdCategory
  Scenario: TC-ProdCategory-12
    Given I set GET endpoints search category
    When I send GET HTTP request search category
    Then I receive valid HTTP response code 200

  @SearchProdCategory
  Scenario: TC-ProdCategory-13
    Given I set GET endpoints search not exist category
    When I send GET HTTP request search not exist category
    Then I receive valid HTTP response code 404

  @SearchProdCategory
  Scenario: TC-ProdCategory-14
    Given I set GET endpoints search category
    When I send GET HTTP request search category without token
    Then I receive valid HTTP response code 401

  @SearchProdCategory
  Scenario: TC-ProdCategory-15
    Given I set GET endpoints search category by page number
    When I send GET HTTP request search category by page number
    Then I receive valid HTTP response code 200

  @SearchProdCategory
  Scenario: TC-ProdCategory-16
    Given I set GET endpoints search not exist category by page number
    When I send GET HTTP request search not exist category by page number
    Then I receive valid HTTP response code 404