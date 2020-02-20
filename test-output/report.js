$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature");
formatter.feature({
  "line": 1,
  "name": "Pray4One Login",
  "description": "",
  "id": "pray4one-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 161708240,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test Login",
  "description": "",
  "id": "pray4one-login;test-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Android device",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the login details",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify the HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "Pray4OneSteps.open_the_desired_device()"
});
formatter.result({
  "duration": 18909315004,
  "status": "passed"
});
formatter.match({
  "location": "Pray4OneSteps.enter_the_login_details()"
});
formatter.result({
  "duration": 7430147771,
  "status": "passed"
});
formatter.match({
  "location": "Pray4OneSteps.click_on_login()"
});
formatter.result({
  "duration": 5694426732,
  "status": "passed"
});
formatter.match({
  "location": "Pray4OneSteps.verify_the_HomePage()"
});
formatter.result({
  "duration": 36868664109,
  "status": "passed"
});
formatter.after({
  "duration": 4873149098,
  "status": "passed"
});
});