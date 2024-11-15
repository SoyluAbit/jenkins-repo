Feature: Scenario Outline Example

  @outline
  Scenario Outline: 
    When i login with "<username>" and "<password>"
    And click on the login button
    Then validate that <"username>" is displayed
    And print by <"fullname>" on the screen

    Examples: 
      | username | password | fullname    |
      | abit     | abit123  | abit soylu  |
      | tima     | tima123  | tima D      |
      | ebru     | ebru123  | ebru demiur |
