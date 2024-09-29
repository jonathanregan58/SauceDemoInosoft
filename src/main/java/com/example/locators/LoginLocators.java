package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {

	  @FindBy(xpath = "//*[@id=\"user-name\"]")
	    public WebElement username_textbox;
	  
	
	    
	    @FindBy(xpath = "//*[@id=\"password\"]")
	    public WebElement password_textbox;
	    
	    
	    @FindBy(xpath = "//*[@id=\"login-button\"]")
	    public WebElement button_login;
	    
	 
	    public final String xpatherror_popup = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
	    
	    @FindBy(xpath = xpatherror_popup)
	    public WebElement error_popup;
	    
	    ////*[@id="login_button_container"]/div/form/div[3]/h3
	   
	    /*
	    public final String xpathselectdropdown = "//*[@id=\"how-select\"]";
	     
	    @FindBy(xpath = xpathselectdropdown)
	    public WebElement DropDownHowDidYouHearAboutUs;
	    */
}
