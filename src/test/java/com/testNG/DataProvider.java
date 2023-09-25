package com.testNG;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "data")
	private void credential(String username,String password) {
		System.out.println("username is:"+username);
		System.out.println("password is:"+password);
		}
     @org.testng.annotations.DataProvider
	public Object[][]data(){
		return new Object[][] {
			{"abc","123"},{"def","456"},{"ghi","678"},{"jkl","567"}};
		
		
		
}
}
