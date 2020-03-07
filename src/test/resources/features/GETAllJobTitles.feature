Feature: Validating Syntax /getOneEmplyee.php HRMS API

  Background: 
    Given user generates token

  @SyntaxJobTitle
  Scenario: calling allJobTitles using /jobTitle.php API
    Given user calls getAllJobTitles API
    When User retrieves response for getAllJobTitles API
    Then status code is 200 for getAllJobTitles API
Then user validates created AllJobTitles