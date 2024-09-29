package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {
	
	
	
	 //@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	 //public WebElement button_shoppingcart;

	 //public final String div_shoppingcart = "//*[@id=\"shopping_cart_container\"]";
	 
	 public final String xpath_shoppingcart = "//*[@id=\"shopping_cart_container\"]/a";
	 @FindBy(xpath = xpath_shoppingcart)
	    public WebElement shoppingcart;
	
	 
	 public final String xpath_saucelabsbackpack = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
	
	    @FindBy(xpath = xpath_saucelabsbackpack)
	    public WebElement saucelabsbackpack;
	    
	    public final String xpath_removesaucelabsbackpack = "//*[@id=\"remove-sauce-labs-backpack\"]";
	    @FindBy(xpath = xpath_removesaucelabsbackpack)
	    public WebElement removesaucelabsbackpack;
	    
	    
	    public final String xpath_saucelabsbacklight = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]";
		
	    @FindBy(xpath =  xpath_saucelabsbacklight)
	    public WebElement saucelabsbacklight;
	    
	  
	    
public final String xpath_removesaucelabsbacklight = "//*[@id=\"remove-sauce-labs-bike-light\"]";
		
	    @FindBy(xpath =  xpath_removesaucelabsbacklight)
	    public WebElement removesaucelabsbacklight;
	    
	    public final String xpath_numbershoppingcart = "//*[@id=\"shopping_cart_container\"]/a/span";
	    @FindBy(xpath = xpath_numbershoppingcart)
	    public WebElement numbershoppingcart;
	    
}
