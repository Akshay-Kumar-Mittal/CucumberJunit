Feature: Application Login

  @Login
  Scenario: Home Page Default Login
    Given User is on home page of the application
    When User clicks on Sign In button
    And Enter Email "testseleniumuser@mail.com" and Password "1234567"
    And Click on Login button
    Then User redirects on Pricing page