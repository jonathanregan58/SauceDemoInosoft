package Runner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.example.utils.HelperClass;
import com.steps.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "com.steps",
//plugin= {"pretty", "html:test-output","json:target/cucumber/cucumber.json", "html:target/cucumber-html-report"})

@CucumberOptions(
		
		features = "src/test/resources/Features",
		glue="com.steps"
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,publish = true
		,tags = "@accesswithoutlogin"
		//"@CartBuy2ItemsAsStandardUser or @ContinueWithFullValues2 or @FinalizeCheckout" 
		//"@CartBuy1ItemAsStandardUser or @ContinueWithFullValues or @FinalizeCheckout"
		//"@CartBuy1ItemAsStandardUser or @ContinueWithoutAnyValues"
		//"@successfulladditemtoppageasstandarduser or @successfulladdotheritemtoppageasstandarduser"
		//"@successfulladditemtoppageasstandarduser or @successfullremoveitemtoppageasstandarduser"
		//"@successfulladditemtoppageasstandarduser"
		//"@successfulloginaslockedoutuser"
		//"@successfulloginasstandarduser"
		//"@CartBuy2ItemsAsStandardUser or @ContinueWithFullValues2"
		//"@successfulladditemtoppageasstandarduser or @successfulladdotheritemtoppageasstandarduser"
		//"@CartBuy2ItemsAsStandardUser or @ContinueWithFullValues2"
		//"@successfulladditemtoppageasstandarduser or @successfulladdotheritemtoppageasstandarduser"
		//"@CartBuy1ItemAsStandardUser or @ContinueWithFullValues or @FinalizeCheckout"
		//"@CartBuy1ItemAsStandardUser or @ContinueWithoutAnyValues"
		//"@successfulladditemtoppageasstandarduser or @successfullremoveitemtoppageasstandarduser"
		
		
		)
 
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	
	
	@BeforeClass
	@Parameters({"browser"})
    public static void setUp(String browser) {
       System.out.println("setup");
       HelperClass.setUpDriver(browser);
    }
 
    
	
}
