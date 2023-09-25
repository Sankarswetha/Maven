package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.LoginPage;

public class PageObjectManager {
 
	public WebDriver driver;
 
	private LoginPage lp;
 
 public PageObjectManager(WebDriver driver2) {
	 this.driver = driver2;
}



public LoginPage getLp() {
	if (lp == null) {
		lp = new LoginPage(driver);
		
	}
	return lp;
}
 
	}

