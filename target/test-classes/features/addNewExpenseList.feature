Feature: add new list expense
    As a owner
    I want to add new expense list

Scenario: Add new income expense list
    When I record type is in with detail is by mom amount 500 baht
    Then total is 500

Scenario: Add new expenditure expense list
    When I record type is out with detail is KFC amount 199 baht
    Then total is -199

Scenario: Add new income and new expenditure expense list
    When I record type is in with detail is by mom amount 500 baht
    And I record type is out with detail is KFC amount 199 baht
    Then total is 301