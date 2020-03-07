Feature: Validating Syntax /getOneEmplyee.php HRMS API

  Background: 
    Given user generates token

  @SyntaxAllEmp
  Scenario: calling Allemployee using /getAllEmployee.php API
    Given user calls getAllEmployee API
    When User retrieves response for getAllEmployee API
    Then status code is 200 for getAllEmployee API
Then user validates created Allemployees