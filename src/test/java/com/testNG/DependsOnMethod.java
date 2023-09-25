package com.testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods = "login")
	private void name() {
		 System.out.println("Name");
	}
	@Test(dependsOnMethods = "login")
	private void emailID() {
		 System.out.println("Emain ID");
		 }
	@Test(dependsOnMethods = "login")
	private void password() {
		 System.out.println("Password");
		 }
	@Test
	private void login() {
		 System.out.println("Login");
		 }

}
