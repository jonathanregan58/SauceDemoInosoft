package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import com.example.actions.LoginActions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.example.actions.CheckoutActions;
import com.example.actions.HomeActions;
import com.example.utils.HelperClass;



public class CheckoutDefinitions {
	
	LoginActions objLogin = new LoginActions();
	HomeActions objHome = new HomeActions();
	CheckoutActions objCheckout = new CheckoutActions();

	@Given("User successfully adds {int} item\\(Sauce Labs Backpack) as Standard User")
	public void user_successfully_adds_item_sauce_labs_backpack_as_standard_user(Integer amount) {
		HelperClass.openPage("https://www.saucedemo.com/");
		 objLogin.login("standard_user", "secret_sauce"); 
		 objLogin.loginclick();
		 System.out.println(objHome.gethomeurl());
		 Assert.assertEquals(objHome.gethomeurl(),"https://www.saucedemo.com/inventory.html");
		 objHome.saucelabsbackpackclick();
		 Assert.assertEquals(objHome.checkremovesaucelabsbackpack(), "Remove");
		 Assert.assertEquals(Integer.valueOf(objHome.checknumbershoppingcart()),amount);
	}
	
	@Given("User successfully adds {int} item\\(Sauce Labs Backpack) and \\(Sauce Labs Backlight) as Standard User")
	public void user_successfully_adds_item_sauce_labs_backpack_and_sauce_labs_backlight_as_standard_user(Integer amount) {
		HelperClass.openPage("https://www.saucedemo.com/");
		 objLogin.login("standard_user", "secret_sauce"); 
		 objLogin.loginclick();
		 System.out.println(objHome.gethomeurl());
		 Assert.assertEquals(objHome.gethomeurl(),"https://www.saucedemo.com/inventory.html");
		 objHome.saucelabsbackpackclick();
		 Assert.assertEquals(objHome.checkremovesaucelabsbackpack(), "Remove");
		 objHome.saucelabsbacklightclick();
		 Assert.assertEquals(objHome.checkremovesaucelabsbacklight(), "Remove");
		 Assert.assertEquals(Integer.valueOf(objHome.checknumbershoppingcart()),amount);
	}

	@When("User clicks on cart icon")
	public void user_clicks_on_cart_icon() {
	    objHome.shoppingcartclick();
	    Assert.assertEquals(objCheckout.getcarturl(),"https://www.saucedemo.com/cart.html");
	}

	@When("User clicks on Checkout button on cart page")
	public void user_clicks_on_checkout_button_on_cart_page() {
		objCheckout.checkoutstep1click();
	}

	@Then("User is on to step one of checkout")
	public void user_is_on_to_step_one_of_checkout_1() {
			Assert.assertEquals(objCheckout.getcheckoutstep1url(),"https://www.saucedemo.com/checkout-step-one.html");
	}

	/*
	@Given("User is on to step one of checkout")
	public void user_is_on_to_step_one_of_checkout_2() {
	   
	}
*/
	
	

	@When("User clicks on Continue button on step one")
	public void user_clicks_on_continue_button_on_step_one() {
		 objCheckout.continuestep1click();
	}

	@Then("message {string} appears on step one of checkout")
	public void message_appears_on_step_one_of_checkout(String message) {
		Assert.assertEquals(objCheckout.geterrormessage(),message);
	}

	@When("User fills below on step one of checkout")
	public void user_fills_below_on_step_one_of_checkout(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		   for(Map<String, String> e: userList)
		   {
			   System.out.println(e.get("FirstName"));
			   System.out.println(e.get("LastName"));
			   System.out.println(e.get("Postal"));
			   objCheckout.checkoutstepone(e.get("FirstName"), e.get("LastName"), e.get("Postal"));
		   }
	   
	}

	
	

	@Then("the prices of these {int} items are")
	public void the_prices_of_these_items_are(Integer int1, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> pricesList = dataTable.asMaps(String.class, String.class);
	
		int counter = 0;
		System.out.println(pricesList.size());
		   
		
			
			      
			      for(Map<String, String> e: pricesList)
				   {
			    	  System.out.println(e);
					   System.out.println("a");
					   System.out.println(e.get("Prices"));
					   System.out.println("b");
					   System.out.println("c");
					   for (int i = 0; i < objCheckout.getprice().size(); i++) {
						   System.out.println("start loop");
						   System.out.println(e.get("Prices"));
						   System.out.println(objCheckout.getprice().get(i));
						   if(e.get("Prices").equals(objCheckout.getprice().get(i)))
						   {
							   System.out.println("Hallo");
							   counter = counter + 1;
						   }
						   
						   System.out.println("end loop");
					   }
					   System.out.println("d");
					  // objCheckout.checkoutstepone(e.get("FirstName"), e.get("LastName"), e.get("Postal"));
				   }
		//   } 
			     
			      assertTrue(counter == int1);

			  
	}
	
	@Then("User is on to step two of checkout where there should be {string} item")
	public void user_is_on_to_step_two_of_checkout_where_there_should_be_item(String amount) {
		System.out.println("a");
		  Assert.assertEquals(objCheckout.getcheckoutstep2url(),"https://www.saucedemo.com/checkout-step-two.html");
		  System.out.println("b");
		  Assert.assertEquals(objCheckout.isrowitemsPresent(),amount);
		 
		 // assertTrue(objCheckout. isrowitemsPresent() == true);
		  System.out.println(objCheckout.isrowitemsPresent());
		  System.out.println("c1");
	}
	
	@When("User clicks Finish on step two of chechout")
	public void user_clicks_finish_on_step_two_of_chechout() {
	   objCheckout.finishbuttonstep2();
	}

	
	
	@Then("User is on complete checkout page where message {string} appears on final page")
	public void user_is_on_complete_checkout_page_where_message_appears_on_final_page(String message) {
		Assert.assertEquals(objCheckout.getcheckoutcompleteurl(),"https://www.saucedemo.com/checkout-complete.html");
		Assert.assertEquals(objCheckout.checkoutcomplete(),message);
	}

	////Thank you for your order!
	
}
