package project_cucumber.UI;

import org.openqa.selenium.By;

public class AppUI {
	public By product =By.xpath("//*[@id='headerMenu']/div/nav/div/div[2]/button/span");
	public By search =By.cssSelector("a[href*='mach3-razors']");
	public By searchbox =By.id("searchIconId");
	public By text =By.id("search-box-input");
	public By result =By.xpath("//*[@id='main-content']/div/h1");
	public By styling =By.xpath("//*[@id='footerContent']/div/div[1]/div[1]/ul/li[2]/a");
	public By find =By.xpath("//*[@id='wrap']/div[2]/div[3]/ul/li[4]/div/div/a/div[2]/h3");

}

