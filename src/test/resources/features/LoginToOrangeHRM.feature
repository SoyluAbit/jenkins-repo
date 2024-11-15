@employeeLogin
Feature: Login to Orange HRM

  Scenario Outline: Login using Scenario Outline and Example Table
    When user enters login info "<username>" and "<password>"
    And I click on login button
    Then Welcome "<firstname>" message is displayed

    Examples: 
      | username    | password  | firstname |
      | Abitsoylu   | abit1234  | Abit      |
      | Hakanyavas  | hakan1234 | Hakan     |
      | Ahmetgelgit | ahmet1234 | Ahmet     |

  Scenario: Login using Datatable
    When user enters username and password and clicks on login
      | username    | password  | firstname |
      | Abitsoylu   | abit1234  | Abit      |
      | Hakanyavas  | hakan1234 | Hakan     |
      | Ahmetgelgit | ahmet1234 | Ahmet     |
