

Feature: Checkout
   User wants to checkout after buying items

  @CartBuy1ItemAsStandardUser
  Scenario: Test Cart Page As Standard User who buys 1 item
    Given User successfully adds 1 item(Sauce Labs Backpack) as Standard User
    When User clicks on cart icon
    And User clicks on Checkout button on cart page
    Then User is on to step one of checkout
    #https://www.saucedemo.com/checkout-step-one.html
    
    @CartBuy2ItemsAsStandardUser
  Scenario: Test Cart Page As Standard User who buys 2 items
    Given User successfully adds 2 item(Sauce Labs Backpack) and (Sauce Labs Backlight) as Standard User
    When User clicks on cart icon
    And User clicks on Checkout button on cart page
    Then User is on to step one of checkout
    
     @ContinueWithoutAnyValues
     Scenario: Continue to Step 2 without entering any value
     When User clicks on Continue button on step one
     Then message "Error: First Name is required" appears on step one of checkout
     
   @ContinueWithFullValues
     Scenario: Continue to Step 2 where all mandatory values(fields) is not empy
     When User clicks on Continue button on step one
     When User fills below on step one of checkout
     |FirstName|LastName|Postal|
     |Jonathan|Regan|123456|
      And User clicks on Continue button on step one
     Then User is on to step two of checkout where there should be "1" item
     
      @ContinueWithFullValues2
     Scenario: Continue to Step 2 where all mandatory values(fields) is not empy
     When User clicks on Continue button on step one
     When User fills below on step one of checkout
     |FirstName|LastName|Postal|
     |Jonathan|Regan|123456|
      And User clicks on Continue button on step one
     Then User is on to step two of checkout where there should be "2" item
     And the prices of these 2 items are
     |Prices|
     |$29.99|
     |$9.99|
     
      @FinalizeCheckout
      Scenario: User finalizes checkout
      When User clicks Finish on step two of chechout
      Then User is on complete checkout page where message "Thank you for your order!" appears on final page
      #//*[@id="checkout_complete_container"]/h2
      #https://www.saucedemo.com/checkout-complete.html
  