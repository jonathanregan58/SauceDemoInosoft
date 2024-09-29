
Feature: Login to Swag lab page 
   User want to login to the Swag Labs page

@successfulloginasstandarduser
  Scenario: Check the login functionality with accepted usernames and passwords
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should navigate to Swag Labs home page
   
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   
  @successfulloginaslockedoutuser
  Scenario: Check the login functionality with valid usernames and invalid passwords
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should not navigate to Swag Labs home page where message "Epic sadface: Sorry, this user has been locked out." appears on login page
    
   
   Examples: 
   |Username | Password |
   |"locked_out_user"|"secret_sauce" |
   
   @faileloginemptyfields
  Scenario: Check the login functionality with empty fields
    Given User should navigate to swag labs login page
    When User click the login button
    Then User should not navigate to Swag Labs home page where message "Epic sadface: Username is required" appears on login page
    
   
  
   

  
   
 