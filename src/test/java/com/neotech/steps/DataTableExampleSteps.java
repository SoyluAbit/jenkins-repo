package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableExampleSteps extends CommonMethods{

	@When("i login to HRM website")
	public void i_login_to_hrm_website() {
		
		loginPage.adminLogin();

	}

@And("i want to add Employees")
	public void i_wan_to_add_employees(DataTable employees) {
	

		// List of maps
//		Map<String, String> map1 = new HashMap<>();
//		map1.put("FirstName", "Paul");
//		map1.put("MiddleName", "M");
//		map1.put("LastNeName", "Desany");
//		
//		Map<String, String> map2 = new HashMap<>();
//		map2.put("FirstName", "umut");
//		map2.put("MiddleName", "");
//		map2.put("LastNeName", "degismen");
//		
//		List<Map<String, String>> list = new ArrayList<>();
//		list.add(map1);
//		list.add(map2);
//		
//	
		
		click(dashboardPage.PIM);
		click(dashboardPage.addEmployeeLink);
		waitForVisibility(By.id("first-name-box"));
		
		
		
		List<Map<String, String>> empyloyeesList = employees.asMaps();
		for (Map<String, String> employee : empyloyeesList) {
			
			sendText(addEmployeePage.firstName, employee.get("FirstName"));
			
			sendText(addEmployeePage.lastName, employee.get("LastName"));
			sendText(addEmployeePage.employeeId,"");
			
			selectDropdown(addEmployeePage.location, 5);
			
			wait(2);
			jsClick(addEmployeePage.saveButton);
			
			
			click(dashboardPage.addEmployeeLink);
			waitForVisibility(By.id("first-name-box"));
			
			System.out.println(employee);
			System.out.println("Frist name: " + employee.get("FirstName"));
			System.out.println("Middle name: " + employee.get("MiddletName"));
			System.out.println("Last name: " + employee.get("LastName"));

		}

	}

	@Then("I validate employee is added")
	public void i_validate_employee_is_added() {

		System.out.println("Validate that employee is addedd");
	}

}
