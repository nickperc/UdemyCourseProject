Feature: User Login feature

  Scenario: User login scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | Username1 | Password1 |
      | Username2 | Password2 |
      | Username3 | Password3 |
      | Username4 | Password4 |
    Then User should be able to login with correct username and password

