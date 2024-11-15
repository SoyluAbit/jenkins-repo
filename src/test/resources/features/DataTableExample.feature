Feature: Screnario with Datatable

  @dataTable
  Scenario: Add employees with data table
    When i login to HRM website
    And i want to add Employees
    
      | FirstName | MiddleNAme | LastName   |
      | umut      | M          | Degismen   |
      | iana      | m          | L          |
      | iana      |            | Gandrabura |
    Then I validate employee is added
