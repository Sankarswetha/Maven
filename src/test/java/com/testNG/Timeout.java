package com.testNG;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 8000)
	private void login() throws InterruptedException {
    Thread.sleep(3000);
    System.out.println("Browserlaunch");
    Thread.sleep(2000);
    System.out.println("url launch");
    Thread.sleep(2000);
    System.out.println("login");

	}

}
