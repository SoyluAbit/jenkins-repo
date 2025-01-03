package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployeeLink;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement employeeList;
	
	@FindBy(id = "logoutLink")
	public WebElement logout;
	
	@FindBy(id="account-job")    // use jsClick with this one 
	public WebElement accountMenu;
	
	@FindBy(xpath = "//i[text()='keyboard_arrow_down']")
	public WebElement accountNameArrow;
	
	@FindBy(css = "li #logoutLink")
	public WebElement logoutButton;
	
	//xpath = "//a[@id='logoutLink']
	
	@FindBy (id = "menu_news_More")
	public WebElement moreMenuItem;
	
	@FindBy (xpath = "//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;
	
	
	
	
	

	

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}