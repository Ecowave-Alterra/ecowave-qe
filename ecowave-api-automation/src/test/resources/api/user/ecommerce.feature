Feature: E-Commerce

  Scenario: TC-User-E-Commerce-1
    Given I set GET endpoints ecommerce
    When I send GET HTTP request ecommerce
    Then I receive valid HTTP response code 200

#  Scenario: TC-User-E-Commerce-2 (masi error)
#    Given I set GET endpoints ecommerce exist filter
#    When I send GET HTTP request ecommerce exist filter
#    Then I receive valid HTTP response code 200
#
#  Scenario: TC-User-E-Commerce-3 (masi error)
#    Given I set GET endpoints ecommerce not exist filter
#    When I send GET HTTP request ecommerce not exist filter
#    Then I receive valid HTTP response code 404