package com.testNG;

import org.testng.annotations.Test;
import com.base.Base_Class;

public class Cross_Browser extends Base_Class {
	@Test
	private void chromeBrowser() {
		launchBrowser("chrome");
		getUrl2("https://www.google.com/");
		System.out.println("Browser ID :"+ Thread.currentThread().getId());
		}
	@Test
	private void firefoxBrowser() {
	   launchBrowser("firefox");
	   getUrl2("https://www.google.com/");
	   System.out.println("Browser ID :"+ Thread.currentThread().getId());
	}
	@Test
	private void edge() {
		 launchBrowser("edge");
		 getUrl2("https://www.google.com/");
		 System.out.println("Browser ID :"+ Thread.currentThread().getId());
	}

}
