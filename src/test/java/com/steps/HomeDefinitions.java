package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import com.example.actions.LoginActions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.example.actions.HomeActions;
import com.example.utils.HelperClass;

public class HomeDefinitions {
	
	LoginActions objLogin = new LoginActions();
	HomeActions objHome = new HomeActions();
	
	@Given("User successfully login as standard user")
	public void user_successfully_login_as_standard_user() {
		HelperClass.openPage("https://www.saucedemo.com/");
		 objLogin.login("standard_user", "secret_sauce"); 
		 objLogin.loginclick();
		 System.out.println(objHome.gethomeurl());
			Assert.assertEquals(objHome.gethomeurl(),"https://www.saucedemo.com/inventory.html");
	}

	
	

	@Then("item in cart should be {int}")
	public void item_in_cart_should_be(Integer amount) {
		System.out.println(objHome.checknumbershoppingcart());
		Assert.assertEquals(Integer.valueOf(objHome.checknumbershoppingcart()),amount);
	}

	

	@When("User clicks {string} on homepage\\(Add)")
	public void user_clicks_on_homepage_add(String string) {
		System.out.println("aa1");
		   objHome.saucelabsbackpackclick();
	}

	@When("User clicks {string} on homepage\\(Remove)")
	public void user_clicks_on_homepage_remove(String string) {
	    objHome.removesaucelabsbackpackclick();
	}

	
	@Then("item in cart should be empty")
	public void item_in_cart_should_be_empty() {
		System.out.println("Return");
		System.out.println(objHome.isNumberinCartPresent());
		assertTrue(objHome.isNumberinCartPresent() == true);
	  //  Assert.assertEquals(objHome.isNumberinCartPresent(), "Success");
	}

	@Then("text {string} should exist on Sauce Labs Backpack if add successful")
	public void text_should_exist_on_sauce_labs_backpack_if_add_successful(String message) {
		System.out.println("a");
		Assert.assertEquals(objHome.checkremovesaucelabsbackpack(), "Remove");
		System.out.println("b");
	}
	
	@Then("text {string} should exist on Sauce Labs Backlight if add successful")
	public void text_should_exist_on_sauce_labs_backlight_if_add_successful(String message) {
		System.out.println("c");
		Assert.assertEquals(objHome.checkremovesaucelabsbacklight(), "Remove");
		System.out.println("d");
	}

	@Then("text {string} should exist on Sauce Labs Backpack if remove successful")
	public void text_should_exist_on_sauce_labs_backpack_if_remove_successful(String string) {
		Assert.assertEquals(objHome.checksaucelabsbackpack(), "Add to cart");
	}
	
	@Given("text {string} should exist on Sauce Labs Backpack")
	public void text_should_exist_on_sauce_labs_backpack(String string) {
		Assert.assertEquals(objHome.checkremovesaucelabsbackpack(), "Remove");
	}
	
	@When("User clicks this item on homepage\\(Add)")
	public void user_clicks_this_item_on_homepage_add(io.cucumber.datatable.DataTable dataTable) {
	   objHome.saucelabsbacklightclick();
	}
}
