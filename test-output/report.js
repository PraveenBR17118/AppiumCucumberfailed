$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature");
formatter.feature({
  "line": 1,
  "name": "Pray4One Login",
  "description": "",
  "id": "pray4one-login",
  "keyword": "Feature"
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
  "name": "Open the desired device",
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
  "duration": 16130636390,
  "status": "passed"
});
formatter.match({
  "location": "Pray4OneSteps.enter_the_login_details()"
});
formatter.result({
  "duration": 121465761,
  "error_message": "java.lang.IllegalArgumentException: Can not set io.appium.java_client.MobileElement field PageObjects.LoginPage.StartButton to com.sun.proxy.$Proxy17\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:167)\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:171)\n\tat sun.reflect.UnsafeObjectFieldAccessorImpl.set(UnsafeObjectFieldAccessorImpl.java:81)\n\tat java.lang.reflect.Field.set(Field.java:764)\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:117)\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:105)\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:92)\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:79)\n\tat PageObjects.LoginPage.\u003cinit\u003e(LoginPage.java:25)\n\tat stepDefinitions.Pray4OneSteps.enter_the_login_details(Pray4OneSteps.java:71)\n\tat ✽.Then Enter the login details(/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/Features/Pray4One.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Pray4OneSteps.click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Pray4OneSteps.verify_the_HomePage()"
});
formatter.result({
  "status": "skipped"
});
});