package com.testNG;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = "Transport")
	private void bike() {
		System.out.println("bike");
		 }
	@Test(groups = "Transport")
	private void car() {
		 System.out.println("car");
		 }
	@Test(groups = "Transport")
	private void motorCycle() {
	System.out.println("motorCycle");	 
	}
	@Test(groups = "Subjects")
	private void tamil() {
		 System.out.println("tamil");
		 }
	@Test(groups = "Subjects")
	private void english() {
		System.out.println("english"); 
		}
	@Test(groups = "Subjects")
	private void science() {
		 System.out.println("science");
  }
	@Test(groups = "HA")
    private void fridge() {
		 System.out.println("fridge");
		 }
	@Test(groups = "HA")
	private void Tv() {
		 System.out.println("Tv");
	}
	@Test(groups = "HA")
	private void AC() {
		 System.out.println("AC");

	}
	
}
