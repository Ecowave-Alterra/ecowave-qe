Feature: Product Page

 Scenario: [POSITIVE] [AUT-5] As a user i want to be able to see product list page
    Given I enter altashop admin page as logged in user
    When I navigate to product list page from navigation bar
    Then I will see product page title
    And I will see the correct columns shown on the product data table
    And I will see the current page as 1

 Scenario: [POSITIVE] [AUT-6] As a user i want to be able to search a newly created product
    Given I enter altashop admin page as logged in user
    When I create a new product using API call
    And I navigate to product list page from navigation bar
    And I search the product from search field
    Then I will see the correct data displayed on table

 Scenario: [POSITIVE] [AUT-9] As a user i want to be able to successfully edit a new product
    Given I enter altashop admin page as logged in user
    When I navigate to product list page from navigation bar
    And I search for an existing product
    And I press edit button for the product
    And I enter valid value on edit product form
    Then I will be able to search the edited product on search form

 Scenario: [POSITIVE] [AUT-7] As a user i want to be able to successfully create a new product
    Given I enter altashop admin page as logged in user
    When I navigate to product list page from navigation bar
    And I press create new product button
    And I enter valid values on the product form
    And I press submit create button for success
    Then I will see success create product message

 Scenario: [POSITIVE] [AUT-8] As a user i want to be able to successfully delete a new product
    Given I enter altashop admin page as logged in user
    When I create a new product using API call
    And I navigate to product list page from navigation bar
    And I search the product from search field
    And I press delete button for the product
    Then I will see success delete product message

 Scenario Outline: [NEGATIVE] [AUT-10] As a user i will not be able to create new product given empty values on required field
    Given I enter altashop admin page as logged in user
    When I navigate to product list page from navigation bar
    And I press create new product button
    And I enter invalid empty value on <EmptyFields> form
    And I press submit create button for fail
    Then I will see error message on <EmptyFields> form
    Examples:
    | EmptyFields |
    | name        |
    | weight      |
    | category    |
    | price       |
    | stock       |
    | image       |
    | deskripsi   |

 Scenario Outline: [NEGATIVE] [AUT-11] As a user i will not be able to create new product given invalid values on required field
    Given I enter altashop admin page as logged in user
    When I navigate to product list page from navigation bar
    And I press create new product button
    And I enter invalid format value on <WrongFields> form
    And I press submit create button for fail
    Then I will see invalid format message on <WrongFields> form
    Examples:
    | WrongFields |
    | weight      |
    | price       |
    | stock       |


