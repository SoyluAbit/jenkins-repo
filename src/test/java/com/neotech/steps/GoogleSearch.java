package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	@Given("I navigated to google.com")
	public void i_navigated_to_google_com() {
		
	   System.out.println("I go to google");
	}

	@When("I type something in the search box")
	public void i_type_something_in_the_search_box() {
		
		 System.out.println("I seacrh for mercedes images");

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
	  
		 System.out.println("then i click on seach button ");

		
	}

	@Then("I can see the result of my seach")
	public void i_can_see_the_result_of_my_seach() {
		
		 System.out.println("Then i can see my result");

		
		
	}

	@Then("I want to see the number of search result")
	public void i_want_to_see_the_number_of_search_result() {
		 System.out.println("Count the search result");

	}

	@When("I say what i want to search for")
	public void i_say_what_i_want_to_search_for() {
	   
		System.out.println("I say search mercedes images");
	}
	
	
	

}
