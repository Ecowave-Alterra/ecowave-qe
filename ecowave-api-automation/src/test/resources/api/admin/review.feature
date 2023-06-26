Feature: Review

  @GetAllReview
  Scenario: TC-Review-1
    Given I set GET endpoints review
    When I send GET HTTP request review
    Then I receive valid HTTP response code 200

  @GetAllReview
  Scenario: TC-Review-3
    Given I set GET endpoints review
    When I send GET HTTP request review without token
    Then I receive valid HTTP response code 401

  @GetAllReview
  Scenario: TC-Review-6
    Given I set GET endpoints review by page number
    When I send GET HTTP request review by page number
    Then I receive valid HTTP response code 200



#  @GetReviewById (ERROR empty review)
#    Scenario: TC-Review-8
#    Given I set GET endpoints review by id
#    When I send GET HTTP request review by id
#    Then I receive valid HTTP response code 200

  @GetReviewById
  Scenario: TC-Review-10
    Given I set GET endpoints review by id
    When I send GET HTTP request review by id without token
    Then I receive valid HTTP response code 401

  @GetReviewById
    Scenario: TC-Review-11
    Given I set GET endpoints review by invalid id
    When I send GET HTTP request review by invalid id
    Then I receive valid HTTP response code 404