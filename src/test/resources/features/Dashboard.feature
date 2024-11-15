

Feature: Dashboard menu

@menu
  Scenario: Dasboard menu items for Admin
    Given user is logged in with valid credentials
    Then I want to validate them items on the menu
      |Admin          |
      |PIM            |
      |My Info        |
      |Discipline     |
      |Reports Catalog |
      |More           |
      |Maintenance    |
	