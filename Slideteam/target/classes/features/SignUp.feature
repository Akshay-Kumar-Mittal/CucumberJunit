@SignUp
Feature: Application Sign Up

  @Sanity
  Scenario: Application Default Sign Up
    Given User is on home page of the application
    When User clicks on Sign Up button
    And Enter following details
    | automationuqaaaaser@testing.com | test | test | 1234567 | 1234567 |
    And Click on Sign Up button
    Then User redirects on Pricing page

