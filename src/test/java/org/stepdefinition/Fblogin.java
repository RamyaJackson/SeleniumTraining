package org.stepdefinition;

import org.Base.BaseClass;
import org.sample.Junittest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClass {
	Junittest j;
	@Given("User has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		WindowMaximize();
	}

	@When("User has to hit  the url of the facebook application")
	public void user_has_to_hit_the_url_of_the_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	    j = new Junittest();
	    passText(em, j.getemail());
	}

	@When("User has to pass the  data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		j= new Junittest();
		passText(pass, j.getpassword());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	 j = new Junittest();
	 clickBtn(j.getloginbtn);	
	 closeEntrireBrowser();
	 }


}