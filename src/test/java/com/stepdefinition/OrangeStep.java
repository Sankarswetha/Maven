package com.stepdefinition;

import com.base.BaseClass;
import com.poma.PageObjectManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class OrangeStep extends BaseClass {
	 public PageObjectManager lp = new PageObjectManager(driver);

	@When("^User Must Launch The \"([^\"]*)\" Url$")
	public void user_Must_Launch_The_Url(String arg1) throws Throwable {
         launchUrl(arg1);
	     implicitwait(30);
	    }

	@When("^User Must Enter The Valid User Name In \"([^\"]*)\" User Name Field$")
	public void user_Must_Enter_The_Valid_User_Name_In_User_Name_Field(String arg1) throws Throwable {
		   passInput(lp.getLp().getUsername(), arg1);    
	}

	@When("^User Must Enter The Valid Password In \"([^\"]*)\" Password Field$")
	public void user_Must_Enter_The_Valid_Password_In_Password_Field(String arg1) throws Throwable {
		 passInput(lp.getLp().getPassword(), arg1);
	}

	@Then("^User Must Click Button and itd Navigation To The User Page$")
	public void user_Must_Click_Button_and_itd_Navigation_To_The_User_Page() throws Throwable {
	      clickButton(lp.getLp().getClick());
	     
	}







}
