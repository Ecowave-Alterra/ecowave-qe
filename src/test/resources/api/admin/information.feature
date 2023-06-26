Feature: Information
  As an admin
  I want to manage information
  So that I can


  @GetAllInformation
  Scenario: TC-Information-1
    Given I set GET endpoints information
    When I send GET HTTP request information
    Then I receive valid HTTP response code 200

  @GetInformationById
  Scenario: TC-Information-2
    Given I set GET endpoints information by id
    When I send GET HTTP request information by id
    Then I receive valid HTTP response code 200

  @GetInformationById
  Scenario: TC-Information-3
    Given I set GET endpoints information by unavailable id
    When I send GET HTTP request information by unavailable id
    Then I receive valid HTTP response code 404

#  @CreateInformation(error)
#  Scenario: TC-Information-4
#    Given I set POST endpoints create information
#    When I send POST HTTP request create information
#    Then I receive valid HTTP response code 201 -> 422

  @CreateInformation
  Scenario: TC-Information-5
    Given I set POST endpoints create information
    When I send POST HTTP request create information blank data
    Then I receive valid HTTP response code 500

  @SearchInformation
  Scenario: TC-Information-8
    Given I set GET endpoints search information by id
    When I send GET HTTP request search information by id
    Then I receive valid HTTP response code 200

  @SearchInformation
  Scenario: TC-Information-9
    Given I set GET endpoints search unavailable information by id
    When I send GET HTTP request search unavailable information by id
    Then I receive valid HTTP response code 404

#  @DeleteInformation(Error)
#  Scenario: TC-Information-10
#    Given I set DELETE endpoints information
#    When I send DELETE HTTP request information
#    Then I receive valid HTTP response code 200