package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import project_cucumber.Utilities.Extentreport;
import project_cucumber.reusablecomponents.CloseChrome;
import project_cucumber.reusablecomponents.OpenChrome;

public class Hooks {
	public static WebDriver driver = null;
	public static Extentreport extent = new Extentreport();
	public static ExtentTest test;
	
	@Before
	public void opendriver()
	{
		OpenChrome op = new OpenChrome();
		driver = op.openBrowser(driver);
		driver.get(op.geturl);
	}
	
	@After
	public void closedriver()
	{
		CloseChrome.close(driver);
		test.log(LogStatus.PASS,"Testcase Passed and browser closed succesfully");
		extent.endTest();
		
		
	}

}
