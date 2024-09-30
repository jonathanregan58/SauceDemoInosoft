package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.example.actions.LoginActions;
import com.example.actions.HomeActions;
import com.example.utils.HelperClass;


import org.openqa.selenium.interactions.Actions;


import org.testng.Assert;
public class LoginDefinitions {
	
	LoginActions objLogin = new LoginActions();
	HomeActions objHome = new HomeActions();
	
	@Given("User should navigate to swag labs login page")
	public void user_should_navigate_to_swag_labs_login_page() {
	  HelperClass.openPage("https://www.saucedemo.com/");
	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String email, String password) {
	 objLogin.login(email, password); 
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	   objLogin.loginclick();
	}

	@Then("User should navigate to Swag Labs home page")
	public void user_should_navigate_to_swag_labs_home_page() {
		//https://www.saucedemo.com/inventory.html
		
	System.out.println(objHome.gethomeurl());
	Assert.assertEquals(objHome.gethomeurl(),"https://www.saucedemo.com/inventory.html");
	
	}

	@Then("User should not navigate to Swag Labs home page where message {string} appears on login page")
	public void user_should_not_navigate_to_swag_labs_home_page_where_message_appears_on_login_page(String message) {
	    // Write code here that turns the phrase above into concrete actions
	//	System.out.println(objLogin.geterrormessage());
		Assert.assertEquals(objLogin.geterrormessage(),message);
		//Assert.assertEquals(objLogin.geterrormessage(),"Epic sadface: Sorry, this user has been locked out.");
	}
	
	@When("User tries to access home page")
	public void user_tries_to_access_home_page() {
		HelperClass.openPage("https://www.saucedemo.com/inventory.html");
	}
	

	

}
