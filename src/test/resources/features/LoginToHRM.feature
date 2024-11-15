@Login
Feature: Login Functionality

  Scenario: Valid Login
    Given I navigated to the HRMS aplication
    When I enter valid username
    And I enter valid pasword
    And I click login button
    Then I validate that I am logged in

  #	And I quit the browser
  Scenario: Invalid Login
    Given I navigated to the HRMS aplication
    When I enter valid username
    And I enter Invalid pasword
    And I click login button
    Then I validate that invalid credentials is shown

  #	And I quit the browser
  @HM3_1
  Scenario Outline: Login using Scenario Outline and Examples
    When I enter the valid "<username>" and "<password>"
    And I click on the submit button
    Then I verify that "<employeeName>" is shown

    Examples: 
      | username | password      | employeeName          |
      | lanalang | beautifulLife | Lana Lang             |
      | test1    | test123456    | testName testLastname |

  @HW3_2
  Scenario: Login using Datatable
    When user enter a username and passwoird and clicks on submit button
      | username | password      | employeeName          |
      | lanalang | beautifulLife | Lana Lang             |
      | test1    | test123456    | testName testLastname |
