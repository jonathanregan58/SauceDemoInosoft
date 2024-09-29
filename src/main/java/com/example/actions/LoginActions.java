package com.example.actions;

import com.example.utils.HelperClass;

import com.example.locators.LoginLocators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class LoginActions {

	
	LoginLocators loginLocators = null;
	
	
	
	public LoginActions() {
		 
        this.loginLocators = new LoginLocators();
        PageFactory.initElements(HelperClass.getDriver(),loginLocators);
    }
	
	
	
	 public void login(String email, String password) {
		 
	        
	        loginLocators.username_textbox.sendKeys(email);
	 
	      
	        loginLocators.password_textbox.sendKeys(password);
	 
	        
	        
	 
	    }
	 
	 
	 public void loginclick() {
		 
	        
		 loginLocators.button_login.click();
	 
	        
	        
	 
	    }
	 
	 public String geturl() {
	    	HelperClass.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	String URL = HelperClass.getDriver().getCurrentUrl();
	        return URL;
	    }
	
	 public String geterrormessage() {
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800)); 
		 ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(loginLocators.xpatherror_popup));
		 WebElement errorpopup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginLocators.xpatherror_popup)));
        return errorpopup.getText();
       
        /*
        public final String googlebuttonstring = "//span[text() = 'Lanjutkan dengan Google']";
        @FindBy(xpath = "//span[text() = 'Lanjutkan dengan Google']")
        		//xpath = "//*[@id=\"container\"]/div/div[2]/span[1]")
        public WebElement googlebutton;
        */
        /*
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
    	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(loginPageLocators.popupsignupstring));
        WebElement googlebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginPageLocators.googlebuttonstring)));
    	googlebutton.click();
        */
    	
    	/*
	    public final String xpathselectdropdown = "//*[@id=\"how-select\"]";
	     
	    @FindBy(xpath = xpathselectdropdown)
	    public WebElement DropDownHowDidYouHearAboutUs;
	    */
    	
    	
	 }
	

}
