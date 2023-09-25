package com.testNG;

import org.testng.annotations.Test;

import com.base.Base_Class;

public class Priority_Test extends Base_Class{
	@Test(priority = -5)
	private void google() {
		launchBrowser("chrome");
		}
	@Test(priority = -1)
	private void firefox() {
		launchBrowser("firefox");
		 }
	@Test(priority = -3)
	private void edge() {
		 launchBrowser("edge");
	}
}
