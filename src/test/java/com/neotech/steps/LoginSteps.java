package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends CommonMethods {

	/**
	 * LoginPageElements login; DashboardPageElements dashBoard;
	 * 
	 */

	@Given("I navigated to the HRMS aplication")
	public void i_navigated_to_the_hrms_aplication() {

		// we started using hooks
//		setUp();  no longer needs this 
		// login = new LoginPageElements();
		// dashBoard = new DashboardPageElements();

	}

	@When("I enter valid username")
	public void i_enter_valid_username() {

		sendText(loginPage.username, ConfigsReader.getProperty("username"));

	}

	@When("I enter valid pasword")
	public void i_enter_valid_pasword() {

		sendText(loginPage.password, ConfigsReader.getProperty("password"));

	}

	@When("I click login button")
	public void i_click_login_button() {

		click(loginPage.loginBtn);

	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {

		String expected = "Jacqualine White";
		String actual = dashboardPage.accountName.getText();

		if (expected.equals(actual)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

	@Then("I quit the browser")
	public void i_quit_the_browser() {
		wait(2);

		// we started using hooks
		// tearDown();

	}

	@When("I enter Invalid pasword")
	public void i_enter_invalid_pasword() {

		sendText(loginPage.password, "WrongPassword");

	}

	@Then("I validate that invalid credentials is shown")
	public void i_validate_that_invalid_credentials_is_shown() {
		String expected = "Invalid Credentials";
		String actual = loginPage.invalidMsg.getText();

		if (expected.equals(actual)) {
			System.out.println("Test passed (invalid credentials)");
		} else {
			System.out.println("Test failed ");
		}

	}

	
	
	@When("I enter the valid {string} and {string}")
	public void i_enter_the_valid_and(String userName, String password) {
	   
	}
	@When("I click on the submit button")
	public void i_click_on_the_submit_button() {
	   
	}
	@Then("I verify that {string} is shown")
	public void i_verify_that_is_shown(String employeeName) {
	    
	}
	
	
	@When("user enter a username and passwoird and clicks on submit button")
	public void user_enter_a_username_and_passwoird_and_clicks_on_submit_button(DataTable employees) {
		
		// convert the datatable to list of maps object
		List<Map<String, String>> employeeList = employees.asMaps();
		
		// looping over the list do the login 
		for(Map<String, String> employee : employeeList)
		{
			System.out.println("login in with : " + employee.get("username") + " and password: " + employee.get("password"));
			

			sendText(loginPage.username, employee.get("username"));
			sendText(loginPage.password, employee.get("password"));
			
			click(loginPage.loginBtn);
			wait(1);
			
			
			
			String actual = dashboardPage.accountName.getText();
			
			Assert.assertEquals("Name does not match" , employee.get("employeeName") , actual );
			
			//loggin out
			jsClick(dashboardPage.accountMenu);
			wait(1);
			jsClick(dashboardPage.logout);
			
			wait(3);
			
			
			
		}
		
	   
		
	}




}
