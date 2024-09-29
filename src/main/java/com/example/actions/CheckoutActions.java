package com.example.actions;

import com.example.utils.HelperClass;


import io.github.bonigarcia.wdm.WebDriverManager;

import com.example.locators.CheckoutLocators;
import com.example.locators.HomeLocators;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CheckoutActions {
	
	CheckoutLocators checkoutLocators = null;
	public CheckoutActions() {
	 
      this.checkoutLocators = new CheckoutLocators();
      PageFactory.initElements(HelperClass.getDriver(),checkoutLocators);
	}
	
 
	
 public void checkoutstep1click() {
	 
     
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
	 WebElement checkoutbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_checkoutbutton)));
	 
	 checkoutLocators.checkoutbutton.click();
 
    }
 
 public void continuestep1click() {
	 
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
	 WebElement continuestep1button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_continuestep1button)));
	 
	 checkoutLocators.continuestep1button.click();
 }
 
 public String geterrormessage() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800)); 
	 ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_errormessagestep1));
	 WebElement errorpopup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_errormessagestep1)));
    return errorpopup.getText();
   
	
 }
 
 public String getcarturl() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_checkoutbutton));
	    WebElement divshoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_checkoutbutton)));
    	
	    String URL = HelperClass.getDriver().getCurrentUrl();
        return URL;
    }
 
 public String getcheckoutstep1url() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_firstnametextboxstep1));
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_lastnametextboxstep1));
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_postcodetextboxstep1));
		WebElement divshoppingcart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_continuestep1button)));
    	
	    String URL = HelperClass.getDriver().getCurrentUrl();
        return URL;
    }
 public String getcheckoutstep2url() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_finishbuttonstep2));
		WebElement buttonfinish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_finishbuttonstep2)));
	 String URL = HelperClass.getDriver().getCurrentUrl();
     return URL;
	 
 }
 
 
 public void checkoutstepone(String fn, String ln, String pc) {
	 
     checkoutLocators.firstnametextboxstep1.sendKeys(fn);
     checkoutLocators.lastnametextboxstep1.sendKeys(ln);
     checkoutLocators.postcodetextboxstep1.sendKeys(pc);
    

     
     

 }
 
 /*
public int numberofitemsincheckout() { 
 
 int numberofitemsincheckout = (new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("checkoutLocators.xpath_rowitemsdivstep2"))).size());
 return numberofitemsincheckout;
}
*/	
 
 /*
public static Boolean isrowitemsPresent() {
    try {
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(60));
    	//HelperClass.getDriver().findElement(By.xpath("homeLocators.xpath_numbershoppingcart")).isDisplayed();
    	//Boolean adaatautidak = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("checkoutLocators.xpath_rowitemsdivstep2")));
    	
    	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_rowitemsdivstep2));
		WebElement buttonfinish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_rowitemsdivstep2)));
    	System.out.println("Element is not displayed");
        return false;
    } catch (NoSuchElementException e) {
        System.out.println("Element is displayed");
        return true;
    }
    */
 
 public String isrowitemsPresent() {
	    
	    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(60));
	    	//HelperClass.getDriver().findElement(By.xpath("homeLocators.xpath_numbershoppingcart")).isDisplayed();
	    	//Boolean adaatautidak = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("checkoutLocators.xpath_rowitemsdivstep2")));
	    	
	    	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_rowitemsdivstep2));
	    	//ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_rowitemsdivstep2_2));
	    	
	    	//int xpathCount = HelperClass.getDriver().findElements(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[@class=\"cart_list\"]/div[@class=\"cart_item\"]")).size();
	    	
	    	//public final String xpath_rowitemsdivstep2_1 = "//*[@id=\"checkout_summary_container\"]/div/div[@class=\"cart_list\"]/div[@class=\"cart_item\"]";
	   	 //@FindBy(xpath = xpath_rowitemsdivstep2_1)
	   	    //public WebElement rowitemsdivstep2_1;
	    	
	    	int xpathCount = HelperClass.getDriver().findElements(By.xpath(checkoutLocators.xpath_rowitemsdivstep2_1)).size();
	    	
	    	//int xpathCount = HelperClass.getDriver().findElements(By.xpath("//*[@id=\"checkout_summary_container\"]")).size();
	    	//int numberofitemsincheckout = ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_rowitemsdivstep2));
			WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_link)));
	    	String stringxpathCount = String.valueOf(xpathCount);
           return stringxpathCount;

}
 
 public ArrayList<String> getprice() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(60));
 	
 	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_rowitemsdivstep2));
 	
 	int xpathCount = HelperClass.getDriver().findElements(By.xpath(checkoutLocators.xpath_rowitemsdivstep2_1)).size();

 	int batas = xpathCount+2;
 	
 	String ok = "No";
 	
 	 ArrayList<String> prices = new ArrayList<String>();

 	
 	for (int i=3; i<=batas; i++) {
 		String getprice= HelperClass.getDriver().findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[" + i + "]/div[2]/div[2]/div")).getText();
 		prices.add(getprice);
 		//(By.xpath("//tbody[@id='se-tbody-result']//tr["+ i + "]//a"));
 		//*[@id="checkout_summary_container"]/div/div[1]/div[4]/div[2]/div[2]/div
    }
 	return prices;
 }

public void finishbuttonstep2() {
	 
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800));
		
	 WebElement finishbuttonstep2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_finishbuttonstep2)));
	 
	 checkoutLocators.finishbuttonstep2.click();
 }

public String checkoutcomplete() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800)); 
	 ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_checkoutcomplete));
	 WebElement checkoutcomplete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_checkoutcomplete)));
    return checkoutcomplete.getText();
}



public String getcheckoutcompleteurl() {
	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(1800)); 
	 ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(checkoutLocators.xpath_checkoutcomplete));
	 WebElement checkoutcomplete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutLocators.xpath_checkoutcomplete)));
	 String URL = HelperClass.getDriver().getCurrentUrl();
     return URL;
}
}