package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.base.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sweth\\OneDrive\\Documents\\Maven_project\\src\\test\\java\\com\\feature\\orange.feature",
glue = "com.stepdefinition")

public class OrangeRun {
public static WebDriver driver;
@BeforeClass
public static void Weblaunch() {
	driver = BaseClass.launchBrowser("Chrome");
}
}
