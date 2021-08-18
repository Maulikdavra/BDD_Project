$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_login.feature");
formatter.feature({
  "line": 2,
  "name": "validate Techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "1 User should able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should able to click on Bank and Cash option on dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should able to click on New Account element under Bank and Cash element",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should be able to enter data in Account Title field \"\u003cAccountTitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to enter data in Description feild \"\u003cDescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to enter data in Intial Balance field \"\u003cInitial Balance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be able to enter data in Account Number field \"\u003cAccount Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be able to enter data in Contact Person field \"\u003cContact Person\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be able to enter data in Contact Phone field \"\u003cContact Phone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should be able to enter data in Banking Url field \"\u003cBanking Url\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should be able to click on Submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "AccountTitle",
        "Description",
        "Initial Balance",
        "Account Number",
        "Contact Person",
        "Contact Phone",
        "Banking Url"
      ],
      "line": 21,
      "id": "validate-techfios-login-functionality;1-user-should-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "MD",
        "xyz",
        "200",
        "232",
        "Maulik",
        "9720101",
        "www.BOFA.com"
      ],
      "line": 22,
      "id": "validate-techfios-login-functionality;1-user-should-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2352374600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1282041100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "1 User should able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@loginFeature"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should able to click on Bank and Cash option on dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should able to click on New Account element under Bank and Cash element",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should be able to enter data in Account Title field \"MD\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to enter data in Description feild \"xyz\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to enter data in Intial Balance field \"200\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be able to enter data in Account Number field \"232\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be able to enter data in Contact Person field \"Maulik\"",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be able to enter data in Contact Phone field \"9720101\"",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should be able to enter data in Banking Url field \"www.BOFA.com\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should be able to click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "LoginSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 222803500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_sigin_button()"
});
formatter.result({
  "duration": 1707314700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 11279500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.User_should_able_to_click_on_Bank_and_Cash_option_on_dashboard()"
});
formatter.result({
  "duration": 102655000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.User_should_able_to_click_on_New_Account_element_under_Bank_and_Cash_element()"
});
formatter.result({
  "duration": 779389400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MD",
      "offset": 58
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Account_Title_field(String)"
});
formatter.result({
  "duration": 100034300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 56
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Description_feild(String)"
});
formatter.result({
  "duration": 95786300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 59
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Intial_Balance_field(String)"
});
formatter.result({
  "duration": 137046800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "232",
      "offset": 59
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Account_Number_field(String)"
});
formatter.result({
  "duration": 97265800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maulik",
      "offset": 59
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Contact_Person_field(String)"
});
formatter.result({
  "duration": 110488100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9720101",
      "offset": 58
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Contact_Phone_field(String)"
});
formatter.result({
  "duration": 86101800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.BOFA.com",
      "offset": 56
    }
  ],
  "location": "LoginSteps.user_should_be_able_to_enter_data_in_Banking_Url_field(String)"
});
formatter.result({
  "duration": 5104546900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_able_to_click_on_Submit_button()"
});
formatter.result({
  "duration": 4587162300,
  "status": "passed"
});
formatter.after({
  "duration": 715151900,
  "status": "passed"
});
});