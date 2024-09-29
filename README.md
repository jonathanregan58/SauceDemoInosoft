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

# How to run
1. Write the tag that contains the test case you wanted to run
*If you want to run 2 or more tags, use or as the connector*If you want to run 2 or more tags, make sure all the tags are from the same feature file
2. Go to testng.xml
3. Right click on testng.xml, hover to "Run As" click "TestNG Suite" where the testing will be run
4. You can look at the test result in report form by going to the folder "Reports" where there will be folder with format "SparkReport dd-mm-yyyy HH-mm-ss" for naming(Example: SparkReport 29-Sep-24 13-29-05). Click on the folder you want to access where there will be one folder called "Reports"(2 if it failed where the second folder is called "Screenshots"). Click on the "Reports" folder where there will be a report in html

