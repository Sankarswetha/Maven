package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters({"username1","password"})
	private void credentials(@Optional("def")String username1,@Optional("123")String password2) {
	System.out.println("username is :"+username1);	
	System.out.println("password is :"+password2);	 

	}

}
