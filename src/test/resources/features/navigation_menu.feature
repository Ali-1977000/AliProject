
  Feature: Navigation Menu

    Scenario: Navigation Fleet -- Vehicles
      Given the user is on the login page
      When  the user logged in as "salesManager"
      And   the user navigates to "Fleet", "Vehicles"
      Then  the title should be "Vehicles"
