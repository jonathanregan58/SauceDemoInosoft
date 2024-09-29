Feature: Item in Swag lab page 
   User wants to Add or remove Item in  Swag lab page
   
   @successfulladditemtoppageasstandarduser
  Scenario: Check whether user can add item on the top of the page as standard user
    Given User successfully login as standard user
    When User clicks "Sauce Labs Backpack" on homepage(Add)
    Then item in cart should be 1
    And text "Remove" should exist on Sauce Labs Backpack if add successful
    
    @successfullremoveitemtoppageasstandarduser
  Scenario: Check whether user can remove item on the top of the page as standard user after add item
    Given item in cart should be 1
    And text "Remove" should exist on Sauce Labs Backpack
    When User clicks "Sauce Labs Backpack" on homepage(Remove)
    Then text "Add to cart" should exist on Sauce Labs Backpack if remove successful
    And item in cart should be empty
    
    
    @successfulladdotheritemtoppageasstandarduser
  Scenario: Check whether user can add other item on the top of the page as standard user
  Given item in cart should be 1
    When User clicks this item on homepage(Add)
    |name|
    |"Sauce Labs Backlight"|
    Then item in cart should be 2 
    And text "Remove" should exist on Sauce Labs Backlight if add successful
    
    #<span class="shopping_cart_badge" data-test="shopping-cart-badge">1</span>
    #public boolean isPresent(By locator) {
 #   try {
  #      webDriver.findElement(locator);
   #     return true;
    #} catch (NoSuchElementException e) {
     #   return false;
    #}
#}