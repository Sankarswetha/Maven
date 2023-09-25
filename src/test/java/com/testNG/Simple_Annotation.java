package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
@BeforeSuite
	private void propertySetting() {
		System.out.println("propertySetting");
		}
@BeforeTest
private void browserLaunch() {
	 System.out.println("chrome");
}
@BeforeClass
private void urlLaunch() {
	 System.out.println("htpps://Flipkart.cpm/");
}
@BeforeMethod
private void login() {
	System.out.println("login");
}
@Test
private void women() {
	 System.out.println("women");
}
@Test
private void men() {
	 System.out.println("men");
}
@Test
private void kids() {
	System.out.println("kids");
}
@AfterMethod
private void logout() {
	 System.out.println("logout");
}
@AfterClass
private void screenshot() {
	 System.out.println("srceenshot");
}
@AfterTest
private void close() {
	 System.out.println("close");
}
@AfterSuite
private void quit() {
	 System.out.println();
}



}
