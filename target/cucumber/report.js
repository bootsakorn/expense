$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/addNewExpenseList.feature");
formatter.feature({
  "line": 1,
  "name": "add new list expense",
  "description": "  As a owner\r\n  I want to add new expense list",
  "id": "add-new-list-expense",
  "keyword": "Feature"
});
formatter.before({
  "duration": 255310,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add new income expense list",
  "description": "",
  "id": "add-new-list-expense;add-new-income-expense-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I record type is in with detail is by mom amount 500 baht",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "total is 500",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "in",
      "offset": 17
    },
    {
      "val": "by mom",
      "offset": 35
    },
    {
      "val": "500",
      "offset": 49
    }
  ],
  "location": "StepDefExpense.i_record_type_is_in(String,String,double)"
});
formatter.result({
  "duration": 287099336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 9
    }
  ],
  "location": "StepDefExpense.total_is(double)"
});
formatter.result({
  "duration": 6882670,
  "status": "passed"
});
formatter.before({
  "duration": 60299,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Add new expenditure expense list",
  "description": "",
  "id": "add-new-list-expense;add-new-expenditure-expense-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I record type is out with detail is KFC amount 199 baht",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "total is -199",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "out",
      "offset": 17
    },
    {
      "val": "KFC",
      "offset": 36
    },
    {
      "val": "199",
      "offset": 47
    }
  ],
  "location": "StepDefExpense.i_record_type_is_in(String,String,double)"
});
formatter.result({
  "duration": 156522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-199",
      "offset": 9
    }
  ],
  "location": "StepDefExpense.total_is(double)"
});
formatter.result({
  "duration": 218104,
  "status": "passed"
});
formatter.before({
  "duration": 41055,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add new income and new expenditure expense list",
  "description": "",
  "id": "add-new-list-expense;add-new-income-and-new-expenditure-expense-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I record type is in with detail is by mom amount 500 baht",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I record type is out with detail is KFC amount 199 baht",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "total is 301",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "in",
      "offset": 17
    },
    {
      "val": "by mom",
      "offset": 35
    },
    {
      "val": "500",
      "offset": 49
    }
  ],
  "location": "StepDefExpense.i_record_type_is_in(String,String,double)"
});
formatter.result({
  "duration": 198004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "out",
      "offset": 17
    },
    {
      "val": "KFC",
      "offset": 36
    },
    {
      "val": "199",
      "offset": 47
    }
  ],
  "location": "StepDefExpense.i_record_type_is_in(String,String,double)"
});
formatter.result({
  "duration": 163364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "301",
      "offset": 9
    }
  ],
  "location": "StepDefExpense.total_is(double)"
});
formatter.result({
  "duration": 139415,
  "status": "passed"
});
});