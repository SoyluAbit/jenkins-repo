package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;


public class DashboardSteps extends CommonMethods {
	
	@Then("I want to validate them items on the menu")
	public void i_want_to_validate_them_items_on_the_menu(DataTable menuItems) {
		
		
		List<String> expectedList = menuItems.asList();
		
		List<String> actualList = new ArrayList<>();
		
		
		// click on the more menu item to clapsed 
		click(dashboardPage.moreMenuItem);
		wait(3);
		
		for(WebElement el :dashboardPage.menuList )
		{
			actualList.add(el.getText());
			
		}
		
		System.out.println("expectedList is: "+ expectedList);
		System.out.println("actualList is: "+ actualList);
		
		// verify actual and expected list matches
		
		Assert.assertEquals(expectedList, actualList);
		
	   
	}

}
