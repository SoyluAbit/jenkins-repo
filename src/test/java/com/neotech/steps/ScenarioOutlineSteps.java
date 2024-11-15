package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	
	@When("i login with {string} and {string}")
	public void i_login_with_and(String username, String password) {
	   

		System.out.println("login with " + username + " and " + password);
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
	   
		System.out.println("cliking on the login button");
		
	}
	@Then("validate that <{string} is displayed")
	public void validate_that_is_displayed(String username) {
		System.out.println("Validated that "+ username +" is displayed");
	    
	}
	@Then("print by <{string} on the screen")
	public void print_by_on_the_screen(String fullname) {
	   
		System.out.println("bye " + fullname);
	}

}
