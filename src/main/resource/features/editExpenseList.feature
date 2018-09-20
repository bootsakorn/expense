# new feature
# Tags: optional

Feature: add new list expense
    As a owner
    I want to edit expense list

Scenario: edit detail expense list
    Give I record type is in with detail is by mom amount 500 baht
    When I edit detail of expense list no. 1 = by dad
    Then detail is by dad

Scenario: edit amount expense list
    Give I record type is in with detail is by mom amount 500 baht
    When I edit amount of expense list no. 1 = 3000.0
    Then amount is 3000.0

Scenario: edit type expense list
    Give I record type is in with detail is by mom amount 500 baht
    When I edit type of expense list no. 1 = out
    Then type is out