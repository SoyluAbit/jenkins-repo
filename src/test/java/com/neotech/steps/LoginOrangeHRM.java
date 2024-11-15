package com.neotech.steps;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginOrangeHRM extends CommonMethods{
	
	

	@When("user enters login info {string} and {string}")
	public void user_enters_login_info_and(String username, String password) {
		
		sendText(loginPage.username, username);
		sendText(loginPage.password, password);
		
	   
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
		
		click(loginPage.loginBtn);
		wait(3);
	
	   
	}
	
	@Then("Welcome {string} message is displayed")
	public void welcome_message_is_displayed(String firstname) {
		
		waitForVisibility(By.id("account-name"));
		
		String expected = firstname;
		String actual = dashboardPage.accountName.getText();
		
		if(expected.contains(actual.toLowerCase()))
		{
			System.out.println("Welcome " + dashboardPage.accountName.getText());
		}
		
		
	   
	}
	
	@When("user enters username and password and clicks on login")
	public void user_enters_username_and_password_and_clicks_on_login(DataTable loginHRM) {
		
	
		List<Map<String, String>> empList = loginHRM.asMaps();	
		
		for(Map<String, String> list : empList)
		{
			
			sendText(loginPage.username, list.get("username"));
			sendText(loginPage.password, list.get("password"));
			
			click(loginPage.loginBtn);
			wait(2);

			waitForVisibility(By.id("account-name"));
			
			wait(2);
			jsClick(dashboardPage.accountName);
			jsClick(dashboardPage.logout);
			wait(2);
			
			
		}
		
		
		
	}


	

}
