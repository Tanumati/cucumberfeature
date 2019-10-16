Feature: As u user i want to register so i can use all facility within my account.
  @register
  Scenario: User should be register successfully.
    Given user is on homepage
    When user enter all register details
    Then user should be able to register successfully