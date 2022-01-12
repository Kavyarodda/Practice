package stepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import project_cucumber.Pageobject.Homepage;

import project_cucumber.Utilities.Screenshots;

public class Scenario1{
	Homepage h;
	
	static Logger log = Logger.getLogger(Scenario1.class);
	@Given("^I am in the home page$")
	public void I_am_in_the_home_page() throws Throwable {
		Hooks.test= Hooks.extent.startTest("Gillette MACH3 Turbo verification1");
		h = new Homepage(Hooks.driver);
		log.info("HomePage opened");
		Thread.sleep(5000);
	}

	@Given("^I Hover on the Products page$")
	public void i_Hover_on_the_Products_page() throws Throwable {
		h = new Homepage(Hooks.driver);
		Actions a = new Actions(Hooks.driver);
		a.moveToElement(h.Hover()).build().perform();
		log.info("Hovered on product page");
	}

	@When("^I click on  MACH button$")
	public void i_click_on_MACH() throws Throwable {
		h = new Homepage(Hooks.driver);
		h.Searching().click();
		log.info("Clicked on MACH3 ");
	}

	@Then("^I should verify that page display \"([^\"]*)\"$")
	public void i_should_verify_that_page_display(String arg1) throws Throwable {
		h = new Homepage(Hooks.driver);
		if (Hooks.driver.getPageSource().contains(arg1))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
		log.info("Gillette MACH3 Turbo is present");
		Screenshots s = new Screenshots();
		s.takeSnapShot(Hooks.driver,"Gillette MACH3 Turbo");
	}
	

}
