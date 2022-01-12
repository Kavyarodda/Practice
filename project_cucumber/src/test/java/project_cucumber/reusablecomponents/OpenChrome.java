package project_cucumber.reusablecomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import project_cucumber.Utilities.ReadPropertyFile;

public class OpenChrome extends ReadPropertyFile{
	public String geturl;
	public WebDriver openBrowser(WebDriver driver) {
		geturl = getUrl();
		System.setProperty("webdriver.chrome.driver", getDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
