$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Handson/Casestudy/src/test/resources/case3.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login",
  "description": "",
  "id": "search-functionality;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User must goto login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid login credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters into the home page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters product to be bought in search tab as \"Headphone\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user purchases the product",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search-functionality;login;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 10,
      "id": "search-functionality;login;;1"
    },
    {
      "cells": [
        "lalitha",
        "",
        "password123"
      ],
      "line": 11,
      "id": "search-functionality;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "login",
  "description": "",
  "id": "search-functionality;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User must goto login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid login credentials \"lalitha\" and \"password123\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters into the home page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters product to be bought in search tab as \"Headphone\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user purchases the product",
  "keyword": "Then "
});
formatter.match({
  "location": "sample2.user_must_goto_login()"
});
formatter.result({
  "duration": 38353837100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lalitha",
      "offset": 41
    },
    {
      "val": "password123",
      "offset": 55
    }
  ],
  "location": "sample2.user_enters_the_valid_login_credentials_and(String,String)"
});
formatter.result({
  "duration": 287707700,
  "status": "passed"
});
formatter.match({
  "location": "sample2.user_enters_into_the_home_page()"
});
formatter.result({
  "duration": 5970988900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Headphone",
      "offset": 51
    }
  ],
  "location": "sample2.user_enters_product_to_be_bought_in_search_tab_as(String)"
});
formatter.result({
  "duration": 30332124700,
  "status": "passed"
});
formatter.match({
  "location": "sample2.user_purchases_the_product()"
});
formatter.result({
  "duration": 606970200,
  "status": "passed"
});
});