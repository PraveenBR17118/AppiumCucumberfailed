Feature: Pray4One Login

  @androidAppium
  Scenario: Test Login
    Given Open the Android device
    Then Enter the login details
    Then Click on login
    And verify the HomePage

  @IOSAppium
  Scenario: Test Login
    Given Open the IOS device
    Then Enter the IOS login details
    Then Click on IOS login
    And verify the IOS HomePage