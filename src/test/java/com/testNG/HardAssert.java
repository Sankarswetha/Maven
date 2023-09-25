package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void Assert() {
		 String exp = "swetha";
		 String act = "swetha";
		 
		 Assert.assertEquals(exp, act);
		 System.out.println("validation");

	}

}
