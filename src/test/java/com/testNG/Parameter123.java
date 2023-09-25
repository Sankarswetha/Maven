package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter123 {
	@Test
	@Parameters({"username","password"})
	private void credential(@Optional("abc")String username3,String password3) {
		System.out.println("username is:"+username3);
		System.out.println("password is:"+password3);
		 

	}

}
