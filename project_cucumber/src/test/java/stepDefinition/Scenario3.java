package stepDefinition;

import org.apache.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project_cucumber.Pageobject.Homepage;
import project_cucumber.Pageobject.Styling;
import project_cucumber.Utilities.Screenshots;

public class Scenario3 {
	static Logger log = Logger.getLogger(Scenario2.class);
	Homepage h;
	Styling sc;
	
	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		Hooks.test= Hooks.extent.startTest("Styling1");
		h = new Homepage(Hooks.driver);
		log.info("HomePage opened");
		Thread.sleep(5000);
	   
	}

	@When("^I click on Styling in footer$")
	public void i_click_on_Styling_in_footer() throws Throwable {
		h = new Homepage(Hooks.driver);
		h.Styling().click();
		Thread.sleep(5000);
		log.info("Clicked on the Styling page in footer");
	}

	
	@Then("^I am styling page$")
	public void i_am_styling_page() throws Throwable {
		log.info("Redirected ti Styling page  verification");
	}

	@Then("^I should verify it contains \"([^\"]*)\" option$")
	public void i_should_verify_it_contains_option(String arg1) throws Throwable {
		sc = new Styling(Hooks.driver);
//		System.out.println(sc.Styling_result());
//		if(sc.Styling_result().equals(arg1))
//			{
//				Assert.assertTrue(true);
//			}
//			else
//			{
//				Assert.assertTrue(false);
//			}
//			log.info("Element found successfully");
			Screenshots s = new Screenshots();
			s.takeSnapShot(Hooks.driver,"Styling");

	}

	

}
