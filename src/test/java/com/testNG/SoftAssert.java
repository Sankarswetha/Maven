package com.testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	private void Asset() {
		 String exp = "swetha";
		 String act = "swetha123";
		 org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		 s.assertEquals(act,exp);
		 System.out.println("verification");

	}

}
