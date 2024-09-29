package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutLocators {

	public final String xpath_checkoutbutton = "//*[@id=\"checkout\"]";
	 @FindBy(xpath = xpath_checkoutbutton)
	    public WebElement checkoutbutton;
	 
	 
	 public final String xpath_continuestep1button = "//*[@id=\"continue\"]";
	 @FindBy(xpath = xpath_continuestep1button)
	    public WebElement continuestep1button;
	 
	 
	 public final String xpath_errormessagestep1 = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3";
	 @FindBy(xpath = xpath_errormessagestep1)
	    public WebElement errormessagestep1;
	 
	 
	 public final String xpath_firstnametextboxstep1 = "//*[@id=\"first-name\"]";
	 @FindBy(xpath = xpath_firstnametextboxstep1)
	    public WebElement firstnametextboxstep1;
	 
	 public final String xpath_lastnametextboxstep1 = "//*[@id=\"last-name\"]";
	 @FindBy(xpath = xpath_lastnametextboxstep1)
	    public WebElement lastnametextboxstep1;
	 
	 public final String xpath_postcodetextboxstep1 = "//*[@id=\"postal-code\"]";
	 @FindBy(xpath = xpath_postcodetextboxstep1)
	    public WebElement postcodetextboxstep1;
	 
	 public final String xpath_finishbuttonstep2 = "//*[@id=\"finish\"]";
	 @FindBy(xpath = xpath_finishbuttonstep2)
	    public WebElement finishbuttonstep2;
	 
	 public final String xpath_rowitemsdivstep2 = "//div[@class=\"cart_item\"]";
	 @FindBy(xpath = xpath_rowitemsdivstep2)
	    public WebElement rowitemsdivstep2;
	 
	 
	 public final String xpath_rowitemsdivstep2_1 = "//*[@id=\"checkout_summary_container\"]/div/div[@class=\"cart_list\"]/div[@class=\"cart_item\"]";
	 @FindBy(xpath = xpath_rowitemsdivstep2_1)
	    public WebElement rowitemsdivstep2_1;
	 
	 public final String xpath_rowitemsdivstep2_2 = "//*[@id=\"checkout_summary_container\"]";
	 @FindBy(xpath = xpath_rowitemsdivstep2_2)
	    public WebElement rowitemsdivstep2_2;
	 
	 
	 public final String xpath_link = "//*[@id=\"item_4_title_link\"]";
	 @FindBy(xpath = xpath_link)
	    public WebElement link;
	 //div[@class='box3 top']
	 
	 
	 public final String xpath_checkoutcomplete = "//*[@id=\"checkout_complete_container\"]/h2"; 
	 @FindBy(xpath = xpath_checkoutcomplete)
	    public WebElement checkoutcomplete;
	
			

}
