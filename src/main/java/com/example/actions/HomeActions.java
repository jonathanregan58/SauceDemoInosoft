package com.example.actions;

import com.example.utils.HelperClass;


import io.github.bonigarcia.wdm.WebDriverManager;

import com.example.locators.HomeLocators;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


 

public class HomeActions {
	
	HomeLocators homeLocators = null;
	public HomeActions() {
	 
      this.homeLocators = new HomeLocators();
      PageFactory.initElements(HelperClass.getDriver(),homeLocators);
  }
	
	 public String gethomeurl() {
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
			
			ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(homeLocators.xpath_shoppingcart));
		    WebElement divshoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_shoppingcart)));
	    	
		    String URL = HelperClass.getDriver().getCurrentUrl();
	        return URL;
	    }
	 
	 public void saucelabsbackpackclick() {
		 
	      
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
			
			ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(homeLocators.xpath_saucelabsbackpack));
		    WebElement saucelabsbackpack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_saucelabsbackpack)));
	    	
		    ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(homeLocators.xpath_shoppingcart));
		    WebElement shoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_shoppingcart)));
		 
		 homeLocators.saucelabsbackpack.click();
	 
	        
	        
	 
	    }
	 
	 public String checksaucelabsbackpack() {
	
     
     WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
     WebElement saucelabsbackpack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_saucelabsbackpack)));
     
     return saucelabsbackpack.getText();
	 }
	 
	 
	 public void saucelabsbacklightclick() {
		 
	      
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
			
			ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(homeLocators.xpath_saucelabsbacklight));
		    WebElement saucelabsbacklight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_saucelabsbacklight)));
	    	
		    
		 homeLocators.saucelabsbacklight.click();
	 
	    }
	 
	 public String checkremovesaucelabsbacklight() {
			
	     
	     WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
	     WebElement saucelabsbacklight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_removesaucelabsbacklight)));
	     
	     return saucelabsbacklight.getText();
		 }
	 
	 public String checknumbershoppingcart() {
			
	     
	     WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
	     WebElement numbershoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_numbershoppingcart)));
	     
	     return numbershoppingcart.getText();
		 }

	 public String checkremovesaucelabsbackpack() {
			
	     
	     WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
	     WebElement removesaucelabsbackpack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_removesaucelabsbackpack)));
	     
	     return removesaucelabsbackpack.getText();
		 }
	 
	 public void removesaucelabsbackpackclick() {
		 
	      
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
			
		 WebElement removesaucelabsbackpack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_removesaucelabsbackpack)));
		 
		 homeLocators.removesaucelabsbackpack.click();
	 
	    }
	
	 
	 public void shoppingcartclick() {
		 
	      
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
			
		 WebElement shoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homeLocators.xpath_shoppingcart)));
		 
		 homeLocators.shoppingcart.click();
	 
	    }
	 
	 public static Boolean isNumberinCartPresent() {
	        try {
	        	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(60));
	        	//HelperClass.getDriver().findElement(By.xpath("homeLocators.xpath_numbershoppingcart")).isDisplayed();
	        	Boolean numberincart = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("homeLocators.xpath_numbershoppingcart")));
	        	
	        	System.out.println("Element is not displayed");
	            return true;
	        } catch (NoSuchElementException e) {
	            System.out.println("Element is displayed");
	            return false;
	        }
	        
	        
	    
	    }
	
}
