Feature: Login Page


  As a gambler with a registered account on William Hill
  I want to log in to my account

    Scenario:Valid Login details
      Given I am on the home page
      When i click the login button
      And i enter my a valid login details
      Then I am able to access my account

    Scenario: Invalid login details
      Given I am on the home page
      When i click the login button
      And i enter invalid login details
      Then i am unable to access my account and get error
