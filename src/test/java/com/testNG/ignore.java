package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class ignore extends Base_Class{
	@Test
	private void google() {
		launchBrowser("chrome");
		}
	@Ignore
	@Test
	private void firefox() {
		launchBrowser("firefox");
		 }
	@Test(enabled = true)
	private void edge() {
		 launchBrowser("edge");

	}
	
	

}
