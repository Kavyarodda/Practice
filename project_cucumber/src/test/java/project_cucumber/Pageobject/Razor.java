package project_cucumber.Pageobject;

import org.openqa.selenium.WebDriver;


import project_cucumber.UI.AppUI;

public class Razor extends AppUI {
WebDriver driver;
	
	public Razor(WebDriver driver) {
		this.driver= driver;
	}
	
	public String Result_verify(){

       return  driver.findElement(result).getText();
    }

}
