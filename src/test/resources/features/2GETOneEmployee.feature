Feature: Validating Syntax /getOneEmplyee.php HRMS API

  Background: 
    Given user generates token

  @OneEmployee
  Scenario: Retrieving created employee using /getOneEmplyee.php API
    Given user calls getOneEmployee API
    When User retrieves response for getOneEmployee API
    Then status code is 200 for getOneEmployee API
Then user validates created employee exists