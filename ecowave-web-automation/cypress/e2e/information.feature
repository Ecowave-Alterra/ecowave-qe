# Feature: Information

#  Scenario: [POSITIVE] [AUT-12] As a user i want to be able to see information list page
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     Then I will see information page title
#     And I will see the correct columns shown on the information data table
#     And I will see the current page as 1

#  Scenario: [POSITIVE] [AUT-13] As a user i want to be able to search a newly created information
#     Given I enter altashop admin page as logged in user
#     When I create a new information using API call
#     And I navigate to information list page from navigation bar
#     And I search the information from search field
#     Then I will see the correct info data displayed on table

#  Scenario: [POSITIVE] [AUT-14] As a user i want to be able to successfully edit a new information
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     And I search the information from search field
#     And I press edit button for the information
#     And I enter valid value on edit information form
#     Then I will be able to see success edit product message

#  Scenario: [POSITIVE] [AUT-15] As a user i want to be able to successfully delete a new information
#     Given I enter altashop admin page as logged in user
#     When I create a new information using API call
#     And I navigate to information list page from navigation bar
#     And I search the information from search field
#     And I press delete button for the information
#     Then I will be able to see success delete product message

#  Scenario: [POSITIVE] [AUT-16] As a user i want to be able to successfully create a new information
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     And I press create new information button
#     And I enter valid values on the information form
#     Then I will see success create information message

#  Scenario Outline: [NEGATIVE] [AUT-17] As a user i will not be able to create new information given empty values on required field
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     And I press create new information button
#     And I enter invalid empty value on <EmptyFields> information form
#     Then I will see submit button as inactive
#     Examples:
#     | EmptyFields      |
#     | title            |
#     | description      |
#     | image            |


#  Scenario: [POSITIVE] [AUT-18] As a user i want to be able to successfully create a new information as draft
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     And I press create new information button
#     And I enter valid values on the information form as a draft
#     Then I will see success create information message as draft

#  Scenario Outline: [POSITIVE] [AUT-19] As a user i want to be able to see information data based on status selection
#     Given I enter altashop admin page as logged in user
#     When I navigate to information list page from navigation bar
#     And I press <status> filter button
#     Then I will see the correct <status> on data shown
#    Examples:
#     | status            |
#     | Terbit            |
#     | Draft             |