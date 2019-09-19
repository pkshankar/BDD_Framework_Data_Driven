$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pkshank/eclipse-workspace/BDD_Framework_Data_Driven/src/test/java/features/create_Gmail_Account.feature");
formatter.feature({
  "line": 1,
  "name": "Create gmail account feature",
  "description": "",
  "id": "create-gmail-account-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Without using Examples keyword"
    },
    {
      "line": 5,
      "value": "#Scenario: Create gmail account scenario"
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#When user is on gmail create account page"
    },
    {
      "line": 8,
      "value": "#Then user enters \"Shawn\" and \"Tin\" and \"shawntin\" and \"shawntin123\" and \"shawntin123\""
    },
    {
      "line": 9,
      "value": "#Then user clicks on next"
    },
    {
      "line": 10,
      "value": "#Then user quits the browser"
    },
    {
      "line": 12,
      "value": "# Using Example keyword"
    },
    {
      "line": 14,
      "value": "#Scenario Outline: Create gmail account scenario"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#When user is on gmail create account page"
    },
    {
      "line": 17,
      "value": "#Then user enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfirmPassword\u003e\""
    },
    {
      "line": 18,
      "value": "#Then user clicks on next"
    },
    {
      "line": 19,
      "value": "#Then user quits the browser"
    },
    {
      "line": 20,
      "value": "#"
    },
    {
      "line": 21,
      "value": "#Examples:"
    },
    {
      "line": 22,
      "value": "#"
    },
    {
      "line": 23,
      "value": "#\t| firstname | lastname  | username | password | confirmPassword |"
    },
    {
      "line": 24,
      "value": "#\t| John\t\t| Scudamore | johns\t   | johns123 | johns123\t\t|"
    },
    {
      "line": 25,
      "value": "#\t| Derek\t\t| Billymore | derekb   | derekb234| derekb234\t\t|"
    },
    {
      "line": 26,
      "value": "#\t| Ron\t\t| Cloney\t| ronc\t   | ronc345  | ronc345 \t\t|"
    },
    {
      "line": 28,
      "value": "# Using DataTable with list"
    },
    {
      "line": 30,
      "value": "#Scenario: Create gmail account scenario"
    },
    {
      "line": 31,
      "value": "#"
    },
    {
      "line": 32,
      "value": "#When user is on gmail create account page"
    },
    {
      "line": 33,
      "value": "#Then user enters firstname and lastname and username and password and confirmPassword"
    },
    {
      "line": 34,
      "value": "#| Eugene | cabral | eugenecabral | eugenec123 | eugenec123 |"
    },
    {
      "line": 35,
      "value": "#Then user clicks on next"
    },
    {
      "line": 36,
      "value": "#Then user quits the browser"
    },
    {
      "line": 39,
      "value": "# Using DataTable with map"
    }
  ],
  "line": 41,
  "name": "Create gmail account scenario",
  "description": "",
  "id": "create-gmail-account-feature;create-gmail-account-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "user is on gmail create account page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user enters firstname and lastname and username and password and confirmPassword",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password",
        "confirmPassword"
      ],
      "line": 45
    },
    {
      "cells": [
        "Roda",
        "Still",
        "rodac",
        "rodac123",
        "rodac123"
      ],
      "line": 46
    },
    {
      "cells": [
        "Shannon",
        "Lawrence",
        "shannonl",
        "shannonl234",
        "shannonl123"
      ],
      "line": 47
    },
    {
      "cells": [
        "Jerry",
        "Peter",
        "jerryp",
        "jerryp654",
        "jerryp654"
      ],
      "line": 48
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user clicks on next",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user quits the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Gmail_Account_Using_Data_Table_Maps_Step_Definition.user_is_on_gmail_create_account_page()"
});
formatter.result({
  "duration": 27601959939,
  "status": "passed"
});
formatter.match({
  "location": "Create_Gmail_Account_Using_Data_Table_Maps_Step_Definition.user_enters_account_details(DataTable)"
});
formatter.result({
  "duration": 28567330633,
  "status": "passed"
});
formatter.match({
  "location": "Create_Gmail_Account_Using_Data_Table_Maps_Step_Definition.user_clicks_on_next()"
});
formatter.result({
  "duration": 621783707,
  "status": "passed"
});
formatter.match({
  "location": "Create_Gmail_Account_Using_Data_Table_Maps_Step_Definition.user_quits_the_browser()"
});
formatter.result({
  "duration": 1690405263,
  "status": "passed"
});
});