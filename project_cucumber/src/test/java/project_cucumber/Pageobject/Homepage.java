package project_cucumber.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_cucumber.UI.AppUI;



public class Homepage extends AppUI {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Hover(){

       return  driver.findElement(product);
    }
	public WebElement Searching(){

	       return  driver.findElement(search);
	    }
	public WebElement Searchbox(){

	       return  driver.findElement(searchbox);
	    }
	public WebElement Textenter(){

	       return  driver.findElement(text);
	    }
	public WebElement Styling(){

	       return  driver.findElement(styling);
	    }
	
}
