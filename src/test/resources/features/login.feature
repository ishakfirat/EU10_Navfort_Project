@NAV10-272
Feature: Users should be able to login


  Background:
    Given The user is on the login page

  @NAV10-262
  Scenario: Login as a driver
    When The user enter driver username
    And The user enter driver password
    And The user click on the LOG IN button
    Then The user is on the Quick Launchpad page

  @NAV10-263
  Scenario: Login as a sales manager
    When The user enter sales manager username
    And The user enter sales manager password
    And The user click on the LOG IN button
    Then The user is on the Dashboard page

  @NAV10-264
  Scenario: Login as a store manager
    When The user enter store manager username
    And The user enter store manager password
    And The user click on the LOG IN button
    Then The user is on the Dashboard page

  @NAV10-265
  Scenario: Login as a user
    When The user enter invalid username
    And The user enter invalid password
    And The user click on the LOG IN button
    Then The user is should see Invalid username or password.

  @NAV10-266
  Scenario: Login as a user
    When The user enter invalid username
    And The user enter valid password
    And The user click on the LOG IN button
    Then The user is should see Invalid username or password.

  @NAV10-267
  Scenario: Login as a user
    When The user enter valid username
    And The user enter invalid password
    And The user click on the LOG IN button
    Then The user is should see Invalid username or password.

  @NAV10-268
  Scenario: Login as a user
    When The user do not enter username
    And The user do not enter password
    And The user click on the LOG IN button
    Then The user is should see pop up coming from username field Please fill out this field.

  @NAV10-269
  Scenario: Login as a user
    When The user enter valid username
    And The user do not enter password
    And The user click on the LOG IN button
    Then The user is should see pop up coming from password field Please fill out this field.

  @NAV10-270
  Scenario: Login as a user
    When The user do not enter username
    And The user enter valid password
    And The user click on the LOG IN button
    Then The user is should see pop up coming from username field Please fill out this field.

  @NAV10-271
  Scenario: Login as a user
    When The user enter valid username
    And The user enter valid password
    And The user click on the LOG IN button
    Then  the username on the login page should match the username top right corner on the home page

