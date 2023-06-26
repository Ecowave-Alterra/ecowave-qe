Feature: Authentication
  As an admin
  I want to login
  So that I can manage all

  @Login
  Scenario: TC-Auth-1
    Given I set POST endpoints login
    When I send POST HTTP request login
    And I receive Message Berhasil Login
    Then I receive valid HTTP response code 200

  @Login
  Scenario: TC-Auth-2
    Given I set POST endpoints login
    When I send POST HTTP request login empty email
    Then I receive valid HTTP response code 400

  @Login
  Scenario: TC-Auth-3
    Given I set POST endpoints login
    When I send POST HTTP request login wrong email and password
    Then I receive valid HTTP response code 400