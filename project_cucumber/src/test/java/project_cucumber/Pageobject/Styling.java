package project_cucumber.Pageobject;

import org.openqa.selenium.WebDriver;

import project_cucumber.UI.AppUI;

public class Styling extends AppUI {
WebDriver driver;
	
	public Styling(WebDriver driver) {
		this.driver= driver;
	}
	
	public String Styling_result(){

       return  driver.findElement(find).getText();
    }

}