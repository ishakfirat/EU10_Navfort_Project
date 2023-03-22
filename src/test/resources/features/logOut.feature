@NAV10-310
Feature: User should be able to log out
  Agile story:The user can log out using the log-out button inside
  the profile info and end up on the login page.
  @NAV10-304
  Scenario: Logout as a driver

    Given Driver on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    Then User should see login page

  @NAV10-305
  Scenario: Logout as a sales manager

    Given Sales manager on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    Then User should see login page

  @NAV10-306
  Scenario: Logout as a store manager

    Given Store manager on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    Then User should see login page

  @NAV10-307
  Scenario: Logout as a driver and click step back button

    Given Driver on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    And User click the step back arrow
    Then User should not go back homa page again

  @NAV10-308
  Scenario: Logout as a sales manager and click step back button

    Given Sales manager on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    And User click the step back arrow
    Then User should not go back homa page again

  @NAV10-309
  Scenario: Logout as a store manager and click step back button

    Given Store manager on the home page
    When User go to profile menu and click the down arrow icon
    And User sees Logout button and click it
    And User click the step back arrow
    Then User should not go back homa page again
