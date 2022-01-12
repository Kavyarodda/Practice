package stepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import project_cucumber.Pageobject.Homepage;
import project_cucumber.Pageobject.Razor;
import project_cucumber.Utilities.Screenshots;

public class Scenario2 {
	static Logger log = Logger.getLogger(Scenario2.class);
	Homepage h;
	Razor r;
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		Hooks.test= Hooks.extent.startTest("Razor search  verification1");
		h = new Homepage(Hooks.driver);
		log.info("HomePage opened");
		Thread.sleep(5000);
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
		h = new Homepage(Hooks.driver);
		h.Searchbox().click();
		Thread.sleep(1000);
		log.info("Clicked on the search button");
	}

	@When("^I enter the text \"([^\"]*)\"$")
	public void i_enter_the_text(String arg1) throws Throwable {
		h = new Homepage(Hooks.driver);
		h.Textenter().sendKeys(arg1);
		h.Textenter().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		log.info("Entered the text ");
	}

	@Then("^I am on the Razor search result page$")
	public void i_am_on_the_Razor_search_result_page() throws Throwable {
		log.info("In the Razor search page");
	}

	@Then("^I should verify that  result contains expected result$")
	public void i_should_verify_that_result_contains() throws Throwable {
	   String arg ="Results For \"Razor\"";
	   System.out.println(arg);
	   r = new Razor(Hooks.driver);
	   if(r.Result_verify().equals(arg))
	   {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
		log.info("The Results For \"Razor\" is found");
		Screenshots s = new Screenshots();
		s.takeSnapShot(Hooks.driver,"Rzor search");
	}
}
