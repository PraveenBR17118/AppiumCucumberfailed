$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature");
formatter.feature({
  "line": 1,
  "name": "Pray4One Login",
  "description": "",
  "id": "pray4one-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 78281750,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Test Login",
  "description": "",
  "id": "pray4one-login;test-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@IOSAppium"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Open the IOS device",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter the IOS login details",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on IOS login",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "verify the IOS HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "Pray4OneiOSSteps.open_the_IOS_device()"
});
