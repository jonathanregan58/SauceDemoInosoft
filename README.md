# SauceDemoInosoft
Testing SauceDemo(https://www.saucedemo.com/) which is assignment from Inosoft

# IDE, Programming Languange, and Tools
IDE for this project is:
Eclipse Java EE IDE for Web Developers.

Version: 2018-09 (4.9.0)

Programming language to compile this project is:
Java 11

Tools for this project is:

Selenium Java 4.25.0

WebDriverManager from BoniGarcia 5.9.2
*Uses chrome only as the browser

Cucumber-Java 6.8.1

Cucumber-Picocontainer 6.8.1

Gherkin 15.0.2

Cucumber-jvm 6.8.1

Cucumber-testng 6.8.1

Extentreports-cucumber6-adapter 2.1.0

Extentreports-testng-adapter 1.2.2

Maven-surefire-plugin 3.0.0-M5

# Test Cases
The test cases are written in the Gherkin(BDD) syntax where it can be accessed by double clicking on "src" folder then double click on "test" folder then double click on "resources" folder then double click on "Features" folder where there are 3 features to be tested(saved in feature format). The 3 features are:

Login

Item

Checkout

Login:

@successfulloginasstandarduser

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1J0mdBqZEwdJW7NeEsLerJ9nfpZAoj97-/view?usp=drive_link

@successfulloginaslockedoutuser

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1YDZ6qK6EkUOnSoA5Oq3llj3tlo1RaHcj/view?usp=drive_link

@faileloginemptyfields

*This is negative

Recording of the execution of the test case above: https://drive.google.com/file/d/1QrmzAJRdj35Nw_SGXaoDPZiqpZchlfJG/view?usp=drive_link

@accesswithoutlogin

*This is negative

Recording of the execution of the test case above: https://drive.google.com/file/d/1TMWGuXvtrZnL27ecRBqkempsPFwLw9A2/view?usp=drive_link


Item:

@successfulladditemtoppageasstandarduser

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1V09Zfq3SbzjFND-t8-73xmThH1MgJ4Bu/view?usp=drive_link

@successfulladditemtoppageasstandarduser -> @successfullremoveitemtoppageasstandarduser

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1GQ5VZch7zPt9EbTjCK7nx6u-pohOwlm7/view?usp=drive_link

@successfulladditemtoppageasstandarduser -> @successfulladdotheritemtoppageasstandarduser

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1i26hdPqDLnxlDqZ7J5gXL-HDd1eBnDQx/view?usp=drive_link

Checkout:

@CartBuy1ItemAsStandardUser -> @ContinueWithoutAnyValues

*This is negative

Recording of the execution of the test case above: https://drive.google.com/file/d/1l8KzlnJyEgn4H42jjwBLf3ik78EhvLV1/view?usp=drive_link

@CartBuy1ItemAsStandardUser ->  @ContinueWithFullValues -> @FinalizeCheckout

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/12j2buud8R5ciGXiw1AhHUcOA8liJn3-K/view?usp=drive_link

@CartBuy2ItemsAsStandardUser ->  @ContinueWithFullValues2 ->  @FinalizeCheckout

*This is positive

Recording of the execution of the test case above: https://drive.google.com/file/d/1E-7zhF5EDN5RP-zD8bHv5zvInvWNj4Sg/view?usp=drive_link

# Process of creating test cases
Conducted exploratory testing first and then divided it to 3 scenarios(Login, Item, and Checkout) and automated the test cases that are commonly executed manually and can be automated within timeframe

# How to run
1. Write the tag that contains the test case you wanted to run
*If you want to run 2 or more tags, use or as the connector(replace the "->" with "or"; look in # Test Cases)
*If you want to run 2 or more tags, make sure all the tags are from the same feature file
3. Go to testng.xml
4. Right click on testng.xml, hover to "Run As" click "TestNG Suite" where the testing will be run
5. You can look at the test result in report form by going to the folder "Reports" where there will be folder with format "SparkReport dd-mm-yyyy HH-mm-ss" for naming(Example: SparkReport 29-Sep-24 13-29-05). Click on the folder you want to access where there will be one folder called "Reports"(2 if it failed where the second folder is called "Screenshots"). Click on the "Reports" folder where there will be a report in html

