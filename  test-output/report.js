$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pkshank/eclipse-workspace/BDD_Framework_Data_Driven/src/test/java/features/gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail test feature",
  "description": "",
  "id": "gmail-test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# This feature is just for learning cucumber tags concept"
    }
  ],
  "line": 6,
  "name": "Gmail login scenario",
  "description": "",
  "id": "gmail-test-feature;gmail-login-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@GmailLogin"
    },
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "This is a gmail login scenario",
  "keyword": "Given "
});
formatter.match({
  "location": "Gmail_Tagging_Cucumber_Step_Definition.this_is_a_gmail_login_scenario()"
});
formatter.result({
  "duration": 327222432,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Gmail send email scenario",
  "description": "",
  "id": "gmail-test-feature;gmail-send-email-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@GmailSendEmail"
    },
    {
      "line": 10,
      "name": "@SmokeTest"
    },
    {
      "line": 10,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "this is a gmail send email scenario",
  "keyword": "Given "
});
formatter.match({
  "location": "Gmail_Tagging_Cucumber_Step_Definition.this_is_a_gmail_send_email_scenario()"
});
formatter.result({
  "duration": 81755,
  "status": "passed"
});
});