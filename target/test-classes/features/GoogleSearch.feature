
Feature: Searching in Google

  Scenario: Search by typing
    Given I navigated to google.com
    When I type something in the search box
    And I click on the search button
    Then I can see the result of my seach
    And I want to see the number of search result

@smoke 
    Scenario: Search by voice
    	Given I navigated to google.com
  	  When I say what i want to search for 	 
  	  Then I can see the result of my seach
  	  And I want to see the number of search result
    	