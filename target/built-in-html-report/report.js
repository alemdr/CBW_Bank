$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/onlinebanking.feature");
formatter.feature({
  "name": "Online Banking Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As A User I should be able to click on Online Banking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definition.onlineBanking.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Online Banking Home",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.onlineBanking.click_on_Online_Banking_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.onlineBanking.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.onlineBanking.enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.onlineBanking.click_on_Submit_button()"
});
formatter.result({
  "status": "passed"
});
});